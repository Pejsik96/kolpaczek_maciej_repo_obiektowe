import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ServerCon{
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private DataOutputStream out;
    private DataInputStream in;
    private int port=12345;
    public void startConnection(){
        try{    
            serverSocket = new ServerSocket(port);
            clientSocket = serverSocket.accept();
            out = new DataOutputStream(clientSocket.getOutputStream());
            in = new DataInputStream(clientSocket.getInputStream());
            Scanner sc = new Scanner(System.in);
            out.writeUTF("Podaj ocene i wage:");
            List<Integer> ocena = new ArrayList<Integer>();
            List<Integer> waga = new ArrayList<Integer>();
            while(true){
                String gowno = in.readUTF();
                if(gowno.contains(";")){
                    String split[] = gowno.split(";"); 
                    if(Integer.valueOf(split[0])>6 || Integer.valueOf(split[0])<1 ){
                        out.writeUTF("nieprawidlowa ocena, wpisz ocene i wage ponownie: ");
                    }
                    else if(Integer.valueOf(split[1])>6 || Integer.valueOf(split[1])<1 ){
                        out.writeUTF("nieprawidlowa waga, wpisz ocene i wage ponownie: ");
                    } 
                    else{
                        ocena.add(Integer.parseInt(split[0]));
                        waga.add(Integer.parseInt(split[1]));
                        Calc calc = new Calc(ocena, waga);
                        out.writeUTF("Średnia ważona:"+calc.srednia()+"\n"+"Odchylenie:"+calc.odchylenie()+"\nPodaj ocene i wage: "); 
                    } 
                }
                else{
                        out.writeUTF("Brak ';'");  
                }               
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
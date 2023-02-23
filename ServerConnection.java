import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class ServerConnection{
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private DataOutputStream out;
    private DataInputStream in;
    private int port=12345;

    public void startConnection(){
        try{
            System.out.println("Pierwsze zadanie");
            serverSocket = new ServerSocket(port);
            clientSocket = serverSocket.accept();
            out= new DataOutputStream(clientSocket.getOutputStream());
            in= new DataInputStream(clientSocket.getInputStream());
            out.writeUTF("Podaj dwie liczby: ");
            int chuj1=in.readInt();
            int chuj2=in.readInt();
            System.out.println(chuj1+" "+chuj2);
            int suma=chuj1+chuj2;
            int roznica=chuj1-chuj2;
            int iloczyn=chuj1*chuj2;
            out.writeUTF("Suma: "+suma+"\nRoznica: "+roznica+"\nIloczyn: "+iloczyn);
            System.out.println("\n\nDrugie zadanie");
            ArrayList<String>lista=new ArrayList<>();
            while(true){
                String slowo=in.readUTF().toLowerCase();
                if(slowo.equals("1")){
                    out.writeUTF(lista.toString()); 
                }
                else{
                    if(!lista.contains(slowo)){
                        lista.add(slowo);
                        out.writeUTF("Wpisano nowe slowo, jesli chcesz wyswietlic liste slow wpisz 1");
                    }
                    else{
                        out.writeUTF("Podane slowo jest juz w liscie podaj inne: ");
                    }
    
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
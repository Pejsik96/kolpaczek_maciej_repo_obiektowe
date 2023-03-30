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

public class ServerMain{
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private DataOutputStream out;
    private DataInputStream in;
    private int port=12345;
    public void startConnection(String[] args){
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
                if(gowno.equals("quit")){
                    //Calculations calc = new Calculations(ocena, waga);
                    out.writeUTF("Średnia ważona:"+calc.getWeightenedAverage()+"\n"+"Odchylenie:"+calc.getDeviation()+"\nS:Podaj ocene (1-6) oraz wagę (1-5) odzielonne (;):");
                }else
                if(gowno.contains(";")){
                    String split[] = gowno.split(";"); 
                    boolean grade = false;
                    boolean weight = false;   
                    if(Integer.valueOf().split[0]>6 && Integer.valueOf().split[0]<6){
                        System.out.println("nieprawidlowa ocena");
                    }else{
                        grade = true;
                        System.out.println("1DOBRZE");
                    }
                    if(Pattern.matches("[1-5]", splitted[1]) == false){
                        System.out.println("2ZLE");
                    }else{
                        weight = true;
                        System.out.println("2DOBRZE");
                    }   
                    if(grade & weight){
                        grades.add(Integer.parseInt(splitted[0]));
                        weights.add(Integer.parseInt(splitted[1]));
                        //out.writeUTF("S:Podaj ocene (1-6) oraz wagę (1-5) odzielonne (;):"); 
                        Calculations calc = new Calculations(grades, weights);
                        out.writeUTF("Średnia ważona:"+calc.getWeightenedAverage()+"\n"+"Odchylenie:"+calc.getDeviation()+"\nS:Podaj ocene (1-6) oraz wagę (1-5) odzielonne (;):"); 
                    }else{
                        out.writeUTF(error+"\nS:Podaj ocene (1-6) oraz wagę (1-5) odzielonne (;):");
                    }   
                }else{
                        out.writeUTF("S:Nie podano jednej z liczb");  
                    }               
                //ans = sc.nextLine();
                //out.writeUTF(ans);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
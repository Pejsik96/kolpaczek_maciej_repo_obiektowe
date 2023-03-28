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
    public static void main(String[] args){
        try{
            ServerSocket server = new ServerSocket(23456);
            Socket socket = server.accept();
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            Scanner sc = new Scanner(System.in);
            out.writeUTF("S:WITAJ NA SERWERZE \nS:Podaj ocene (1-6) oraz wagę (1-5) odzielonne (;):");
            List<Integer> grades = new ArrayList<Integer>();
            List<Integer> weights = new ArrayList<Integer>();
            while(true){
                String ans = in.readUTF();
                if(ans.equals("quit")){
                    Calculations calc = new Calculations(grades, weights);
                    out.writeUTF("Średnia ważona:"+calc.getWeightenedAverage()+"\n"+"Odchylenie:"+calc.getDeviation()+"\nS:Podaj ocene (1-6) oraz wagę (1-5) odzielonne (;):");
                }else
                if(ans.contains(";")){
                    String splitted[] = ans.split(";");
                    if(!splitted[0].equals("") && splitted.length > 1){    
                        String error = "";
                        boolean grade = false;
                        boolean weight = false;   
                        if(Pattern.matches("[1-6]", splitted[0]) == false){
                            error += "Zła ocena, ";
                            System.out.println("1ZLE");
                        }else{
                            grade = true;
                            System.out.println("1DOBRZE");
                        }
                        if(Pattern.matches("[1-5]", splitted[1]) == false){
                            error += "Zła waga, ";
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
                }else{
                    out.writeUTF("S:Podano złe dane (BRAK ;)");
                }
                
                //ans = sc.nextLine();
                //out.writeUTF(ans);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
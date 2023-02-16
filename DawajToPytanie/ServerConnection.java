import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.IOException;
public class ServerConnection{
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private DataOutputStream out;
    private DataInputStream in;
    private int port;
    public void startConnection(){
        try{
            serverSocket = new ServerSocket(12345);
            clientSocket = serverSocket.accept();
            out= new DataOutputStream(clientSocket.getOutputStream());
            in= new DataInputStream(clientSocket.getInputStream());
            out.writeUTF("Elo daj liczbe");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        String input="";
        while(true){
            try{
                input = in.readUTF();
                System.out.println("INPUT: "+input);
    
                out.writeUTF("gowno");
                if(input.equals("quite")) break;
            }
            catch(IOException e){
                System.out.println("Katastrofa"+e);
            }
        }
    };
}
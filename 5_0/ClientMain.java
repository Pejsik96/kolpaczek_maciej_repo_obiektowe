import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
public class ClientMain {
    public static void main(String args[]){
        
        Socket socket;
        try {
            socket = new Socket("127.0.0.1", 23456);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            Scanner sc = new Scanner(System.in);
            while(true){
                String ans = in.readUTF();
                System.out.println(ans);
                ans = sc.nextLine();
                out.writeUTF(ans);
            }
        }catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.100.4", 1234);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());

            Scanner sc = new Scanner(System.in);
            while (true) {
                String ans = in.readUTF();
                System.out.println(ans);

                ans = sc.nextLine();
                out.writeUTF(ans);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

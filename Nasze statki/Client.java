import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String SERVER_IP = "127.0.0.1"; // Adres IP serwera
    private static final int SERVER_PORT = 12345;

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

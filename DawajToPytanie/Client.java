package zad1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    private Socket socket;
    private DataOutputStream out;
    private DataInputStream in;
    private String address = "192.168.60.205";
    private int port = 12345;

    public Client() {
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");

            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
        } catch (UnknownHostException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        run();
    }

    public void run() {
        String line = "", question = "";
        Scanner sc = new Scanner(System.in);

        while(!line.equals("Good bye")) {
            try {
                line = in.readUTF();
                System.out.println(line);
                if(!line.equals("Good bye")) {
                    question = sc.nextLine();
                    out.writeUTF(question);
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        close();
    }

    public void close() {
        try {
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
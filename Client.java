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

        try {
            System.out.println("PIERWSZE ZADANIE");
            System.out.println(in.readUTF());
            System.out.print("Pierwsza liczba >>> ");
            int pierwsza_liczba = sc.nextInt();
            System.out.print("Druga liczba >>> ");
            int druga_liczba = sc.nextInt();
            out.writeInt(pierwsza_liczba);
            out.writeInt(druga_liczba);
            System.out.println(in.readUTF());

            System.out.println("\n\nDRUGIE ZADANIE");
            while(true) {
                String slowo = sc.next();
                out.writeUTF(slowo);
                System.out.println(in.readUTF());
            }
        } catch (IOException e) {
            System.out.println(e);
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
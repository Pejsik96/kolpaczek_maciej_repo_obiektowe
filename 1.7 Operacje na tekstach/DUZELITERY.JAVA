import java.io.*;
import java.util.Scanner;

public class DUZELITERY{
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String zdanie = sc.nextLine();
        System.out.println(zdanie.toUpperCase());
   }
}
import java.util.Scanner;

public class Menu {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz dzialanie");
        System.out.println("1- Dodaj");
        System.out.println("2- Wyswietl");
        System.out.println("3- Zmien");
        System.out.println("4- Usun");
        System.out.println("5- Wyjscie");
        System.out.print("Wybor: ");
    }
}

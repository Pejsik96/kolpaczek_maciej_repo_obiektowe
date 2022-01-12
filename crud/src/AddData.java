import java.util.Scanner;

public class AddData {
    public static UserData insertData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj email: ");
        String email=sc.nextLine();
        System.out.print("Podaj rok urodzenia: ");
        String dataurodzenia=sc.nextLine();
        System.out.print("Podaj imie: ");
        String imie=sc.nextLine();
        System.out.print("Podaj nazwisko: ");
        String nazwisko=sc.nextLine();

        return new UserData(email,dataurodzenia,imie,nazwisko);
    }
}

import java.util.Scanner;

class DLUGOSC{
    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String imie = sc.nextLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = sc.nextLine();
        System.out.println("Dlugosc Imie: "+imie.length());
        System.out.println("Dlugosc Naziwsko: "+nazwisko.length());
    }
}
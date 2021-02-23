import java.util.Scanner;

class LITERY{
    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String wyraz = sc.nextLine();
        char pierwsza = wyraz.charAt(0);
        System.out.println(pierwsza);
        int dlugosc = wyraz.length() -1;
        char ostatnia = wyraz.charAt(dlugosc);
        System.out.println(ostatnia);
    }
}
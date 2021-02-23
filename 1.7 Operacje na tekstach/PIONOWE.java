import java.util.Scanner;

class PIONOWE{
    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String wyraz = sc.nextLine();
        int dlugosc = wyraz.length();
        for(int i=0; i<dlugosc; i++){
            System.out.println(wyraz.charAt(i));
        }
    }
}
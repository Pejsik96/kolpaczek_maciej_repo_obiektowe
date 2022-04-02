import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zabijesie zabijesie;
        Scanner sc=new Scanner(System.in);
        System.out.println("Wybierz czy chcesz wczytac imie(1), czy wzrost(2) ");
        int wybor= sc.nextInt();
        switch (wybor){
            case 1:
                zabijesie=new Imie();
                zabijesie.imiona();
                break;
            case 2:
                zabijesie=new Wiek();
                zabijesie.wiek();
                break;
        }
    }
}
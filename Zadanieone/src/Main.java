import java.util.Random;
import java.util.Scanner;

class Main{
    public static void main(String [] args){
            Zabijesie zabijesie;
            Scanner sc=new Scanner(System.in);
            System.out.println("Wybierz czy chcesz zapisac do tablicy(1) czy array list(2)");
            int wybor= sc.nextInt();
            switch (wybor){
                case 1:
                    zabijesie=new Tablica();
                    zabijesie.tablica();
                    break;
                case 2:
                    zabijesie=new MyArray();
                    zabijesie.lista();
                    break;
            }
    }
}


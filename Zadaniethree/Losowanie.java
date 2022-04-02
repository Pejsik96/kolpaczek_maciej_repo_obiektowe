import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Losowanie implements Zabijesie {
    @Override
    public int losowanko(){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Witaj w programie ktory wylosuje 10 liczb, z podanego przez ciebie zakresu");
        System.out.println("Podaj liczbe POCZATKOWA zakresu");
        int a=scan.nextInt();
        System.out.println("Podaj liczbe OSTATNIA zakresu");
        int b=scan.nextInt();
        int pick=0;
        System.out.println("Wpisz jeden(1) jesli liczby moga sie powtarzac, dwa(2) jesli nie");
        int c=scan.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();
        if(c==1){
            for (int i = 0; i<10; i++) {
                pick = rand.nextInt(b-a)+a;
                System.out.println(pick);
            }  
        }
        else{
            for (int i=a; i<=b; i++) lista.add(i);
            for (int i = 0; i<10; i++) {
                int wynik=rand.nextInt(lista.size()-1);
                pick = lista.get(wynik);
                System.out.println(pick);
                lista.remove(wynik);
    
            }
        }
        return c;

    }
    
}


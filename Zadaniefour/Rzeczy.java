import java.util.ArrayList;
import java.util.Scanner;

public class Rzeczy implements Intertwarz {
    @Override
    public String slowo(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoje imie: ");
        String imie = scanner.nextLine();
        ArrayList<Character> samogloski = new ArrayList<Character>();
        samogloski.add('a');
        samogloski.add('e');
        samogloski.add('i');
        samogloski.add('o');
        samogloski.add('u');
        samogloski.add('y');

        System.out.print("Podane imie czytane wspak: ");
        for (int i = imie.length() - 1; i >= 0 ; i--) {
            System.out.print(imie.charAt(i));
        }
        System.out.println("\nSamogloski: ");
        for(int i=0; i<imie.length(); i++){
            if(samogloski.contains(imie.charAt(i))){
                System.out.print(imie.charAt(i)+", ");
            }
        }
        System.out.println("\nSpolgloski: ");
        for(int i=0; i<imie.length(); i++){
            if(!samogloski.contains(imie.charAt(i))){
                System.out.print(imie.charAt(i)+", ");
            }
        }
        return imie;
    }
}

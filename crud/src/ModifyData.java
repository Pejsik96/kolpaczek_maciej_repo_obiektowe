import java.util.ArrayList;
import java.util.Scanner;

public class ModifyData {
    public static void modifyData(ArrayList<UserData> lista){
        System.out.println("============================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rekord ktory chcesz zmodyfikowac. Liczba mozliwych rekordow: "+lista.size());
        System.out.print("Wybor: ");
        int indeks=sc.nextInt()-1;
        if(indeks>=0 && indeks< lista.size()){
            UserData userData = lista.get(indeks);
            System.out.println("Podaj nowe imie ["+userData.getImie()+"] Wpisz to samo, jesli nie chcesz zmieniac imienia");
            System.out.print("Pisz: ");
            String imie=sc.next();
            System.out.println("Podaj nowe nazwisko ["+userData.getNazwisko()+"] Wpisz to samo, jesli nie chcesz zmieniac nazwiska");
            System.out.print("Pisz: ");
            String nazwisko=sc.next();
            System.out.println("Podaj nowa date urodzenia ["+userData.getDataurodzenia()+"] Wpisz to samo, jesli nie chcesz zmieniac daty urodzenia");
            System.out.print("Pisz: ");
            String dataurodzenia=sc.next();
            System.out.println("Podaj nowy email ["+userData.getEmail()+"] Wpisz to samo, jesli nie chcesz zmieniac emaila");
            System.out.print("Pisz: ");
            String email=sc.next();
            System.out.print("============================================");
            if(!imie.isEmpty() && !nazwisko.isEmpty() && !email.isEmpty() && !dataurodzenia.isEmpty()){
                userData.setImie(imie);
                userData.setNazwisko(nazwisko);
                userData.setDataurodzenia(dataurodzenia);
                userData.setEmail(email);
            }
        }
        else{
            System.out.println("Nie ma takiego rekordu");
            System.out.println("============================================");
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class ModifyData {
    public static void modifyData(ArrayList<UserData> lista){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rekord ktory chcesz zmodyfikowac. Liczba mozliwych rekordow: "+lista.size());
        int indeks=sc.nextInt()-1;
        if(indeks>=0 && indeks< lista.size()){
            UserData userData = lista.get(indeks);
            System.out.println("Podaj nowe imie ["+userData.getImie()+"] Wpisz to samo, jesli nie chcesz zmieniac imienia");
            String imie=sc.next();
            System.out.println("Podaj nowe nazwisko ["+userData.getNazwisko()+"] Wpisz to samo, jesli nie chcesz zmieniac nazwiska");
            String nazwisko=sc.next();
            System.out.println("Podaj nowa date urodzenia ["+userData.getDataurodzenia()+"] Wpisz to samo, jesli nie chcesz zmieniac daty urodzenia");
            String dataurodzenia=sc.next();
            System.out.println("Podaj nowy email ["+userData.getEmail()+"] Wpisz to samo, jesli nie chcesz zmieniac emaila");
            String email=sc.next();
            if(!imie.isEmpty() && !nazwisko.isEmpty() && !email.isEmpty() && !dataurodzenia.isEmpty()){
                userData.setImie(imie);
                userData.setNazwisko(nazwisko);
                userData.setDataurodzenia(dataurodzenia);
                userData.setEmail(email);
            }
        }
        else{
            System.out.println("Nie ma takiego rekordu");
        }
    }
}

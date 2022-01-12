import java.util.ArrayList;
import java.util.Scanner;
public class DeleteData {
    public static void deleteData(ArrayList<UserData> lista){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rekord ktory chcesz usunac. Liczba mozliwych rekordow: "+lista.size());
        int indeks=sc.nextInt()-1;
        if(indeks>=0 && indeks< lista.size()){
            UserData userData = lista.get(indeks);
            System.out.println("Usunieto rekord numer "+(indeks+1));
            lista.remove(userData);
        }
        else{
            System.out.println("Nie ma takiego rekordu");
        }
    }
}
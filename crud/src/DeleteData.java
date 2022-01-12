import java.util.ArrayList;
import java.util.Scanner;
public class DeleteData {
    public static void deleteData(ArrayList<UserData> lista){
        System.out.println("============================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rekord ktory chcesz usunac. Liczba mozliwych rekordow: "+lista.size());
        System.out.print("Wybor: ");
        int indeks=sc.nextInt()-1;
        if(indeks>=0 && indeks< lista.size()){
            UserData userData = lista.get(indeks);
            System.out.println("Usunieto rekord numer "+(indeks+1));
            lista.remove(userData);
            System.out.println("============================================");
        }
        else{
            System.out.println("Nie ma takiego rekordu");
            System.out.println("============================================");
        }
    }
}
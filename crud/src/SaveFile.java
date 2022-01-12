
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class SaveFile {
    public static void saveData(ArrayList<UserData> lista){
        try{
            FileWriter fw = new FileWriter("tajne_dane.csv");
            String dane = lista.toString();
            String[] wynik= dane.split(","); 
            for(int i=0; i<wynik.length; i++){
                fw.write(wynik[i]+"\n");
            }
            fw.close();
        }catch(IOException e){
            System.out.print("error");
        }
    }
}

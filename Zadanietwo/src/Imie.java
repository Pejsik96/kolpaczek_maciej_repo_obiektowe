import java.io.File;
import java.util.Scanner;

public class Imie implements Zabijesie{
    @Override
    public String imiona(){
        String tekst="";
        int zapychacz=0;
        try {
          Scanner scan = new Scanner(new File("Dane.txt"));
          while (scan.hasNext()) {  
            if (scan.hasNextInt()) {
              scan.next();
              zapychacz=1;
            }
            else{
              System.out.println(scan.next());
            }
          }
        } catch(Exception e) {
      
        }
        return tekst;
    }

    @Override
    public int wiek() {
        return 0;
    }
}

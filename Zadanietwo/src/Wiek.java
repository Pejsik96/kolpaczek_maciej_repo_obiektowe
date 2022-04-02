import java.io.File;
import java.util.Scanner;

public class Wiek implements Zabijesie{
    @Override
    public String imiona(){
        return null;
    }

    @Override
    public int wiek() {
        int wiek=0;
        int zapychacz=0;
        try {
          Scanner scan = new Scanner(new File("Dane.txt"));
          while (scan.hasNext()) {  
            if (scan.hasNextInt()) {
              System.out.println(scan.nextInt());
            }
            else{
              scan.next();
              zapychacz=1;
            }
          }
        } catch(Exception e) {
      
        }
        return wiek;
    }
}
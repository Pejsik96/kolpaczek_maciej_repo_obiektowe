import java.util.ArrayList;
import java.util.Random;

public class Tablica implements  Zabijesie{
    @Override
    public int[] tablica(){
            Random rand = new Random();
            int[] tab = new int[5];
            for (int i = 0; i < tab.length; i++) {
                tab[i] = rand.nextInt(50);
                System.out.println(tab[i]);
            }
            return tab;
        }

    @Override
    public ArrayList<Integer> lista() {
        return null;
    }
}

import java.util.ArrayList;
import java.util.Random;

public class MyArray implements Zabijesie{
    @Override
    public int[] tablica() {
        return null;
    }

    @Override
    public ArrayList<Integer> lista(){
        ArrayList al = new ArrayList();
        Random rand = new Random();
        int pick;
        for (int i = 0; i<10; i++) {
            pick = rand.nextInt(100);
            al.add(pick);
            System.out.println("Contents of al: " + al);
        }
        return al;
    }
}

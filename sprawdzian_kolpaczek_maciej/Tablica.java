import java.util.Random;
class Tablica{
    public Tablica(){
        int [] tab = new int[10];
        for (int i=0;i<tab.length;i++){
            tab[i] =(int) (Math.random() *21-10);
            System.out.println(tab[i]);
        }
    }
}
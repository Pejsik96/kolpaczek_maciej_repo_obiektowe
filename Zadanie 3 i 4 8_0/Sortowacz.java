import java.util.Random;

public class Sortowacz {
    public static void main(String[] args) {
        int[] tab=new int[1000];
        Random r=new Random();
        for(int i=0; i<tab.length; i++){
            tab[i]=r.nextInt(100)+1;
        }
        //bubbleSort(tab);
        //quickSort(tab, 0, tab.length-1);
        //insertionSort(tab);
        print(tab);
    }
    public static void bubbleSort(int[] tab){
        for(int i=0; i<tab.length-1; i++){
            for(int j=0; j<tab.length-i-1; j++){
                if(tab[j]>tab[j+1]){
                    int temp=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=temp;
                }
            }
        }
    }
    public static int partition(int tab[], int begin, int end) {
        int pivot = tab[end];
        int i = (begin-1);
    
        for (int j = begin; j < end; j++) {
            if (tab[j] <= pivot) {
                i++;
    
                int swapTemp = tab[i];
                tab[i] = tab[j];
                tab[j] = swapTemp;
            }
        }
    
        int swapTemp = tab[i+1];
        tab[i+1] = tab[end];
        tab[end] = swapTemp;
    
        return i+1;
    }
    public static void quickSort(int tab[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(tab, begin, end);
    
            quickSort(tab, begin, partitionIndex-1);
            quickSort(tab, partitionIndex+1, end);
        }
    }
    public static void insertionSort(int tab[])
    {
        int i, key, j;
        for (i = 1; i < tab.length; i++) {
            key = tab[i];
            j = i - 1;
            while (j >= 0 && tab[j] > key) {
                tab[j + 1] = tab[j];
                j = j - 1;
            }
            tab[j + 1] = key;
        }
    }
    public static void print(int[] tab){
        for(int i=0; i<tab.length; i++){
            System.out.println(tab[i]);
        }
    }
}

import java.util.Random;
class MyObject{
    private int tab[];
    
    // 0 - numbers 1- odd numbers 2- even numbers
    public MyObject(int length_of_table,int choose_number_type){    
        tab = new int[length_of_table];
        switch(choose_number_type){
            case 0: fillTab(); break;
            case 1: fillTabWithOdd(); break;
            case 2: fillTabWithEven(); break;
        }
        fillTab();
    }
    private void fillTab(){
        Random r = new Random();
        for (int i=0; i<tab.length;i++){
            tab[i] = r.nextInt(1000);
        }
    }
    private void fillTabWithEven(){
        Random r = new Random();
        for (int i=0; i<tab.length;i++){
            tab[i] = r.nextInt(1000);
        }
    }
    private void fillTabWithOdd(){
        Random r = new Random();
        for (int i=0; i<tab.length;i++){
            int nr = r.nextInt(1000);
            if (nr % 2 !=0){
                tab[i] = nr;
            else
                tab[i] = nr+1;
            }
                
            tab[i] = r.nextInt(1000);
        }
    }
    
    public int[] getTab(){
        return tab;
    }
    @Override
    public String toString(){
        return "Array has length: "+tab.length;
    }
}

class TablicaDwuwymariowa{
    public static void main(String[] args){
        int [] tab = new int[5];
        tab[0]=40;
        //tab[1]="Jeden";
        for(int i=0; i<tab.length; i++){
            System.out.println(tab[i]);
        }

        int [][] tab2d=new int[5][2];

        tab2d[0][1]=50;
        System.out.println(tab2d.length);
        System.out.pritln(tab2d.length*tab2d[0].length);
        for(int i=0; i<tab2d.length; i++){
            for (int j=0; j<tab2d[i].length; j++){
                System.out.println(tab2d[i][j]);
            }
            System.out.println("Koniec tepli z mienna j");
        }
        System.out.println("Koniec petli z zmienna i");
    }
}

class TablicaDwuwymariowa{
    public static void main(String[] args){
        int [][] tab2x2 = new int [2][2];
        tab2x2 [0][0] = 1;
        tab2x2 [0][1] = 2;
        tab2x2 [1][0] = 3;
        tab2x2 [1][1] = 4;
        for(int i=0;i<tab2x2.length;i++){
            for(int j=0;j<tab2x2[i].length;j++){
                System.out.println(tab2x2[i][j]);
            }
        }
    }
    /*
    private static void tab2dFirst(){

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
    private static void przypomnienieTablicJednowymiarowych{
        int [] tab = new int[5];
        tab[0] = 40;
        //tab[1] = "Jeden"; //error
        //wyswietlanie elementow tablicy:
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }
    */
}
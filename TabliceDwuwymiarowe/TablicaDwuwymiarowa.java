
class TablicaDwuwymariowa{
    public static void main(String[] args){

    }
    private void tab2dFirst(){

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
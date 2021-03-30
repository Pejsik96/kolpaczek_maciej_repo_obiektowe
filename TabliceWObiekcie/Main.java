class Main{
    public static void main(String[] args){
        MyObject mo = new MyObject(100);
        int tab [] = mo.getTab();
        for (int i = 0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
        System.out.println(mo);
        
    }
}
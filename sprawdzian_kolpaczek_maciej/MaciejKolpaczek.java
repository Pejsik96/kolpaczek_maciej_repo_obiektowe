
class MaciejKolpaczek{
    public static void main (String[] args){
        Sprawdzian spr=new Sprawdzian("07-04-2021\n",6,"\nPROGRAMOWANIE OBIEKTOWE");
        System.out.println(spr.data+" "+spr.ocena+" "+spr.nazwa);

        Dane d=new Dane("Maciej","Kolpaczek","31-10-2004");
        System.out.println(d);

        Tablica tab = new Tablica();
        System.out.println(tab);
    }
}
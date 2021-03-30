
class CwiczenieObiektowe_1{
    public static void main (String[] args){
        MojeDane md=new MojeDane("Maciej","Kolpaczek","2PTN");
        System.out.println(md.imie+" "+md.nazwisko+" "+md.klasa);

        Logowanie l=new Logowanie("akronim","123ADFGE32");
        System.out.println(l);
    }
}
class Obiekt {
    public static void main (String [] args){
        //zdefiniowanie i stworzenie obiektu
        ObiektPudelko op = new ObiektPudelko();
        System.out.println("Domyslna wartosc: "+op.wysokosc);

        op.wysokosc = 100;
        System.out.println("Po zmodyfikowaniu: "+op.wysokosc);
    }
    
}
class Osoba{
    Osoba os=new Osoba();
    public String imie="Maciej";
    public String nazwisko="Kolpaczek"
}

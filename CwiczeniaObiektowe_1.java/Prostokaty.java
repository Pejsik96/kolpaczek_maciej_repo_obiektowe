
class Prostokaty{
    private int a;
    private int b;
    
    public Kolo(double promien){
        this.promien = promien;
    }
    
    public double pole_kola(){
        double pole = liczba_pi * (promien*promien);
        System.out.println(pole);
        return pole;
    }
    public double obwod_kola(){
        double obwod = 2*liczba_pi*promien;
        System.out.println(obwod);
        return obwod;
    }
}
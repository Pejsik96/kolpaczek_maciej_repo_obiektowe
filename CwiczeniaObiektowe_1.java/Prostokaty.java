class Prostokaty{
    private int a;
    private int b;
    
    public Prostokaty(int a,int b){
        this.a = a;
        this.b = b;
        
    }
    public int PoleKwadratu(){
        int PoleKwadratu = a*a;
        System.out.println("Pole kwadratu: "+ PoleKwadratu);
        return PoleKwadratu;
    }
    public int ObwodKwadratu(){
        int ObwodKwadratu = 4*a;
        System.out.println("Obwod kwadratu: "+ ObwodKwadratu);
        return ObwodKwadratu;
    }
    public int PoleProstokata(){
        int PoleProstokata = a*b;
        System.out.println("Pole prostokata: "+ PoleProstokata);
        return PoleProstokata;
    }
    public int ObwodProstokata(){
        int ObwodProstokata = 2*a+2*b;
        System.out.println("Obwod Prostokata: "+ObwodProstokata);
        return ObwodProstokata;
    }
}
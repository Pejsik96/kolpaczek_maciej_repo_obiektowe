class Triangle {
    public Triangle(int wysokosc, int podstawa){
        System.out.println("Pole trojkata "+wysokosc*podstawa/2);
    }
    public Triangle(int podstawa){
        System.out.println("Rownoboczny "+(podstawa*podstawa*Math.sqrt(3)/4));
    }
    public Triangle(int a, int b, int c, int r){
        System.out.println("Pole trojkata "+(a*b*c/4*r));
    }
    //Reszte konstruktorow nie zrobimy bez znajomosci sinusow etc oraz poniewaz juz istnieja takie konstruktory
}
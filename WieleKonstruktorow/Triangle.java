class Triangle {
    public Triangle(int wysokosc, int podstawa){
        System.out.println("Pole trojkata "+wysokosc*podstawa/2);
    }
    public Triangle(int podstawa){
        System.out.println("Rownoboczny "+(Math.pow(podstawa, 2)*Math.pow(podstawa, 1/3))/4);
    }
}
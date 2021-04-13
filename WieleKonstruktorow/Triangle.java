
class Triangle{

    private int a;
    private int h;

    public Triangle(int a,int h){
        this.a = a;
        this.h = h;   
    }


    
    public int PoleTriangle(){
        int Pole = h*a/2;
        System.out.println("Pole : "+ Pole);
        return Pole;
    }
}
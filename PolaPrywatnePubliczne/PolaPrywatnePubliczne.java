
class PolaPrywatnePubliczne{
    static DaneOsobowe dos;
    public static void main(String [] args){
        dos = new DaneOsobowe();
        System.out.println("BMI: "dos.bmi() );
        dos.wzrost= 192;
        dos.waga=94;
        System.out.println("BMI: "dos.bmi() );
    }
}
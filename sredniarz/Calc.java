import java.util.List;

public class Calc {
    private List<Integer> oceny;
    private List<Integer> wagi;
    public Calc(List<Integer> oceny, List<Integer> wagi) {
        this.oceny = oceny;
        this.wagi = wagi;
    }
    public float srednia() {
        float a = 0;
        float b = 0;
        for (int i = 0; i < oceny.size(); i++) {
            int ocena = oceny.get(i);
            int waga = wagi.get(i);
            a += ocena*waga;
            b += waga;
        }
        float srednia = a/b;
        return srednia;
    }
    public double odchylenie() {
        double a = 0;
        int i = 0;
        for (i = 0; i < oceny.size(); i++) {
            int ocena = oceny.get(i);
            a += ocena;
        }
        double srednia=  a / i;
        double wynik = 0;
        for (i = 0; i < oceny.size(); i++) {
            int ocena = oceny.get(i);
            wynik += (ocena*ocena);
        }
        return Math.sqrt((wynik/i)-(srednia*srednia));
    }
}
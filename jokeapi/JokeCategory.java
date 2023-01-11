import java.util.Scanner;

public class JokeCategory {
    private String kategoria="";
    Scanner sc=new Scanner(System.in);

    public void JokeCat(){
        System.out.println("Wybierz kategorie żartu(Any(Kazda), Programming(Programowanie), Miscellaneous(Rozne), Dark(Czarny Humor), Pun(Gra Slow), Spooky(Straszny), Christmas(Swiateczny)");
        kategoria=sc.nextLine();
    }
    public String getCat(){
        return kategoria;
    }
}

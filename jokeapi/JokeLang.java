import java.util.Scanner;

public class JokeLang {
    private String lang="";
    Scanner sc=new Scanner(System.in);
    public void JokeLanguage() {
        System.out.println("Wybierz język żartu(cs-czeski, de-niemiecki, en-angielski, es-hiszpanski, fr-francuski, pt-portugalski)");
        lang=sc.nextLine();
        lang.toUpperCase();
    }
    public String getLang(){
        return lang;
    }
}

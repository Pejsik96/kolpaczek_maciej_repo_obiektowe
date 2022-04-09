import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static int liczbagraczy;
    public static int iloscrund;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String losu = "upo";
        Random rand = new Random();
        Kategorie kategorie = new Kategorie();

        System.out.println("Witaj w grze koło fortuny");
        System.out.println("Wybierz liczbe graczy: ");

        liczbagraczy = sc.nextInt();

        System.out.println("Wybierz ilośc rund: ");
        iloscrund = sc.nextInt();

        // przypisywanie do konstruktorow itd
        int[] punktygracza = new int[3];
        GameSettings gameSettings = new GameSettings(liczbagraczy, iloscrund);
        gameSettings.setLiczbagraczy(liczbagraczy);
        gameSettings.setIloscrund(iloscrund);

        // for ktory daje kolej jakiegoś gracza
        for (int i = 1; i <= gameSettings.getLiczbagraczy(); i++) {
            System.out.println("Tura gracza nr " + (i));

            // for ktory daje runde aktualna
            for (int zagranerundy = 1; zagranerundy <= gameSettings.getIloscrund(); zagranerundy++) {
                System.out.println("Runda nr " + zagranerundy);

                // while ktory losuje kategorie dopoki nie klikniesz L
                while (!losu.equals("L")) {

                    System.out.println("By zaczac losowac nacisnij L");
                    losu = sc.next();
                    losu = losu.toUpperCase();

                    if (losu.equals("L")) {
                        String wylosowanakategoria = kategorie.losowanie(); // losuje se kategorie z osobnego pliku
                        System.out.println("Wylosowano kategorie: " + wylosowanakategoria);
                        System.out.println("Kliknij E zeby wylosować poziom trudnosci");
                        String trudlosu = "upo";

                        // while ktory losuje trudnosc dopoki nie klikniesz E
                        while (!trudlosu.equals("E")) {

                            System.out.println("By zaczac losowac nacisnij E");
                            trudlosu = sc.next();
                            trudlosu = trudlosu.toUpperCase();

                            if (trudlosu.equals("E")) {

                                int trudnosc = rand.nextInt(9 - 1);

                                // sciezki do plikow bedziesz wiedzial ocb ale sram komentarzami
                                String sciezka = "pytania/" + wylosowanakategoria + ".txt";
                                String sciezkaodp = "pytania/" + wylosowanakategoria + "Odp.txt";
                                if (trudnosc < 3) {
                                    // miejsce pytania zeby sobie je wziac z pliku
                                    int n = trudnosc;
                                    try {

                                        // bierze ci tutaj konkretna linijke z pliku
                                        String pytanie = Files.readAllLines(Paths.get(sciezka)).get(n);
                                        System.out.println("Wylosowales latwe pytanie");
                                        System.out.println("Twoje pytanie to:");
                                        System.out.println(pytanie);

                                        // bierze ci tutaj konkretna linijke z pliku
                                        String odpowiedz = Files.readAllLines(Paths.get(sciezkaodp)).get(n);
                                        System.out.println("Podaj odpowiedz: ");
                                        String odpowiedzuzyt = sc.next();
                                        odpowiedzuzyt = odpowiedzuzyt.toUpperCase();
                                        if (odpowiedzuzyt.equals(odpowiedz)) {
                                            System.out.println("Podales dobra odpowiedz");
                                            // dodawanie punktow graczowi
                                            punktygracza[i - 1] = punktygracza[i - 1] + 1;
                                        } else {
                                            System.out.println("Podales zla odpowiedz");

                                        }
                                    } catch (IOException e) {
                                        System.out.println(e);
                                    }

                                } else if (trudnosc > 2 && trudnosc < 6) {
                                    // miejsce pytania zeby sobie je wziac z pliku
                                    int n = trudnosc;
                                    try {
                                        // bierze ci tutaj konkretna linijke z pliku
                                        String pytanie = Files.readAllLines(Paths.get(sciezka)).get(n);
                                        System.out.println("Wylosowales srednie pytanie");
                                        System.out.println("Twoje pytanie to:");
                                        System.out.println(pytanie);

                                        // bierze ci tutaj konkretna linijke z pliku
                                        String odpowiedz = Files.readAllLines(Paths.get(sciezkaodp)).get(n);
                                        System.out.println("Podaj odpowiedz: ");
                                        String odpowiedzuzyt = sc.next();
                                        odpowiedzuzyt = odpowiedzuzyt.toUpperCase();
                                        if (odpowiedzuzyt.equals(odpowiedz)) {
                                            System.out.println("Podales dobra odpowiedz");
                                            // dodawanie punktow graczowi
                                            punktygracza[i - 1] = punktygracza[i - 1] + 2;
                                        } else {
                                            System.out.println("Podales zla odpowiedz");
                                        }

                                    } catch (IOException e) {
                                        System.out.println(e);
                                    }

                                } else {
                                    // miejsce pytania zeby sobie je wziac z pliku
                                    int n = trudnosc;
                                    try {
                                        // bierze ci tutaj konkretna linijke z pliku
                                        String pytanie = Files.readAllLines(Paths.get(sciezka)).get(n);
                                        System.out.println("Wylosowales trudne pytanie");
                                        System.out.println("Twoje pytanie to:");
                                        System.out.println(pytanie);

                                        // bierze ci tutaj konkretna linijke z pliku
                                        String odpowiedz = Files.readAllLines(Paths.get(sciezkaodp)).get(n);
                                        System.out.println("Podaj odpowiedz: ");
                                        String odpowiedzuzyt = sc.next();
                                        odpowiedzuzyt = odpowiedzuzyt.toUpperCase();
                                        if (odpowiedzuzyt.equals(odpowiedz)) {
                                            System.out.println("Podales dobra odpowiedz");
                                            // dodawanie punktow graczowi
                                            punktygracza[i - 1] = punktygracza[i - 1] + 3;
                                        } else {
                                            System.out.println("Podales zla odpowiedz");
                                        }

                                    } catch (IOException e) {
                                        System.out.println(e);
                                    }
                                }

                            } else {
                                System.out.println("Kliknales zly przyciks");
                            }
                        }
                        // resetuje zmienna trudlosu zeby while dalej dzialal
                        trudlosu = "upo";
                    } else {
                        System.out.println("Kliknales zly przyciks");
                    }
                }
                // resetuje zmienna losu zeby while dalej dzialal
                losu = "upo";
            }
        }
        ScoreBoard.scoreBoard(punktygracza);
    }

}

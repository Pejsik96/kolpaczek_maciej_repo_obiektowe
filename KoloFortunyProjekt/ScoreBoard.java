import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoreBoard {
    public static void scoreBoard(int[] punktygracza){
                
                GameSettings gameSettings = new GameSettings(Main.liczbagraczy, Main.iloscrund);
                // wyswietlanie ilosci punktow
                System.out.println("Ilosc punktow: ");
                int najpunktow = -1; // ustawione na -1 zeby zbierało najwieksza ilosc punktow
                int wygrany = 0;
                List<Integer> miejsca = new ArrayList<Integer>(); // do sortowania punktow arraylist
        
                for (int i = 1; i <= gameSettings.liczbagraczy; i++) {
        
                    System.out.println("Gracz nr " + (i) + " z iloscia punktow " + punktygracza[i - 1]);
                    miejsca.add(punktygracza[i - 1]);
                    if (punktygracza[i - 1] > najpunktow) {
                        najpunktow = punktygracza[i - 1]; // nadpisuje tutaj ta najwieksza ilosc punktow
                        wygrany = i; // dodaje gracza ktory ma najwieksza ilosc punktow jako wygranego
        
                    } else {
        
                    }
        
                }
                //
        
                // sortowanie punktow
                miejsca.sort(Collections.reverseOrder());
        
                for (int i = 1; i <= gameSettings.liczbagraczy; i++) {
                    System.out.println(i + ". " + miejsca.get(i - 1));
        
                }
                //
        
                System.out.println("Wygrywa gracz nr " + wygrany);
    }
}

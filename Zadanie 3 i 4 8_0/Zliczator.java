import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Zliczator{
    int ilosc_samoglosek=0;
    int ilosc_spolglosek=0;
    int inne=0;
    int nierozpoznane=0;
    ArrayList<String> spolgloski = new ArrayList<>(Arrays.asList("b", "c", "ć", "d", "f", "g", "h", "j", "k", "l", "ł", "m","n", "ń", "p", "r", "s", "ś", "t", "w", "x", "z", "ź", "ż"));
    ArrayList<String> samogloski = new ArrayList<>(Arrays.asList("a", "ą", "e", "ę", "i", "o", "ó", "u", "y"));
    ArrayList<String> znakiSpecjalne = new ArrayList<>(Arrays.asList("!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "@", "[", "\\", "]", "^", "_", "`", "{", "|", "}", "~"));
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Podaj wyraz: "); //test! test! = 6 2 2 1, Gowno = 3 2 0
        String wyraz=sc.nextLine();
        wyraz=wyraz.toLowerCase();
        Zliczator zliczator = new Zliczator();
        zliczator.zliczanie(wyraz); //Zliczanie polsich znaków oczywiscie nie działa, szok!
        System.out.println("Ilosc spolglosek: "+zliczator.ilosc_spolglosek);
        System.out.println("Ilosc samoglosek: "+zliczator.ilosc_samoglosek);
        System.out.println("Ilosc znakow specjalnych: "+zliczator.inne);
        System.out.println("Ilosc znakow nierozpoznanych, bądź spacji: "+zliczator.nierozpoznane);
    }
    public int zliczanie(String wyraz){
        char[] podzielony_wyraz=wyraz.toCharArray();
        for(int i=0; i<podzielony_wyraz.length; i++){
            if (spolgloski.contains(Character.toString(podzielony_wyraz[i]))){
                ilosc_spolglosek++;
            }
            else if(samogloski.contains(Character.toString(podzielony_wyraz[i]))){
                ilosc_samoglosek++;
            }
            else if(znakiSpecjalne.contains(Character.toString(podzielony_wyraz[i]))){
                inne++;
            }
            else{
                nierozpoznane++;
            }
        }
        return 0;
    }


}
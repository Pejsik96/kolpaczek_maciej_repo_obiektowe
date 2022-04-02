import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Rzeczy implements Xdddd {
    @Override
    public int dninaswiecie(){
        Scanner userInput = new Scanner(System.in);
    
        int todayYear = Calendar.getInstance().get(Calendar.YEAR);
        int todayMonth = Calendar.getInstance().get(Calendar.MONTH);
        todayMonth+=1;
        int todayDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        System.out.println("Dzisiejsza data to: "+todayDay+"-"+todayMonth+"-"+todayYear);
    
        Calendar today = new GregorianCalendar(todayYear, todayMonth,
                todayDay);
    
        System.out.println("Podaj date urodzenia: ");
        System.out.print("Rok: ");
        int yearBorn = userInput.nextInt();
        System.out.print("Miesiac: ");
        int monthBorn = userInput.nextInt();
        System.out.print("Dzien: ");
        int dayBorn = userInput.nextInt();
        Calendar born = new GregorianCalendar(yearBorn, monthBorn, dayBorn);
    
        double roznica = today.getTimeInMillis() - born.getTimeInMillis();
        roznica = roznica/(24*60*60*1000);
        System.out.println(Math.round(roznica+1));
        return 0;
    }
}

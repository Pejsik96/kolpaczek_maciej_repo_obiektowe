import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Rzeczy implements Xdddd {
    @Override
    public int dninaswiecie(){
        Scanner scanner = new Scanner(System.in);

        int todayDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int todayMonth = Calendar.getInstance().get(Calendar.MONTH)+1;
        int todayYear = Calendar.getInstance().get(Calendar.YEAR);

        Calendar today = new GregorianCalendar(todayYear, todayMonth, todayDay);

        System.out.println("Podaj date urodzenia: ");
        String data = scanner.next();
        String[] format = data.split("-");

        String l1 = format[0];
        String l2 = format[1];
        String l3 = format[2];

        int birthDay = 0;
        int birthMonth = 0;
        int birthYear = 0;

        if(l1.length() == 2 && l2.length() == 2 && l3.length() == 4){
            birthDay = Integer.parseInt(l1);
            birthMonth = Integer.parseInt(l2);
            birthYear = Integer.parseInt(l3);
        }else if (l1.length() == 4 && l2.length() == 2 && l3.length() == 2){
            birthDay = Integer.parseInt(l3);
            birthMonth = Integer.parseInt(l2);
            birthYear = Integer.parseInt(l1);
        }
        
        Calendar born = new GregorianCalendar(birthYear, birthMonth, birthDay);
        
        double roznica = today.getTimeInMillis() - born.getTimeInMillis();
        roznica = roznica/(24*60*60*1000);
        System.out.println(Math.round(roznica));
    
        return 0;
    }
}

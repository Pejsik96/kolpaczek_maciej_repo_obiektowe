import java.util.Scanner;
public class Joke {
    private int amount=0;
    Scanner sc=new Scanner(System.in);
    public void JokeAmount() {
        System.out.println("Podaj ilość żartów: ");
        amount=sc.nextInt();
        if(amount>10){
            System.out.println("Za duża ilość, ustawiono 10");
            amount=10;
        }
    }
    
    public int getAmount(){
        return amount;
    }
}

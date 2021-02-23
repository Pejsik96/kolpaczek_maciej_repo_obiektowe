import java.util.Scanner;
import java.io.*;

class Prostokaty{
	public static void main(String [] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Wybierz kwadrat lub prostokat lub exit: ");
		String wybor = sc.nextLine();
		wybor=wybor.toUpperCase();
		
		if(wybor.equals("KWADRAT")){
			int bok = 0;
			System.out.println("Wybrales kwadrat");
			while (bok <=0){
				System.out.println("Podaj bok kwadratu: ");
				bok = sc.nextInt();
			}
			int pole = bok*bok;
			bok = bok-1;
			for(int i=0;i<=bok;i++){
				for(int j=0;j<=bok;j++){
					if(i==0||j==0||i==bok||j==bok){
						System.out.print("* ");
					}else{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			System.out.println("Pole wynosi " + pole);
		}else if(wybor.equals("PROSTOKAT")){
			int bok1=0;
			int bok2=0;
			System.out.println("Wybrales prostokat");
			while (bok1 <=0){
				System.out.println("Podaj pierwszy bok prostokatu: ");
				bok1 = sc.nextInt();
			}
			while (bok2 <=0){
				System.out.println("Podaj drugi bok prostokatu: ");
				bok2 = sc.nextInt();
			}
			int pole = bok1*bok2;
			bok1 = bok1-1;
			bok2 = bok2-1;
			for(int i=0;i<=bok1;i++){
				for(int j=0;j<=bok2;j++){
					if(i==0||j==0||i==bok1||j==bok2){
						System.out.print("* ");
					}else{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			System.out.println("Pole wynosi " + pole);
		}else if(wybor.equals("EXIT")){
			System.out.println("Zamykam program");
		}else{
			System.out.println("Nie ma takiej opcji");
		}
	}
}
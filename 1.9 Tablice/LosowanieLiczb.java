import java.util.Random;
import java.util.Scanner;
import java.io.*;

class LosowanieLiczb{
    public static void main(String[] args){
		int czylosowac[] = new int[10]; 
		int ileliczb[] = new int[10];
		int i, j;
        i=0;
        j=0;
		try{
            Scanner sc = new Scanner(new File("ileliczb.txt"));
            while(sc.hasNext()){
                ileliczb[i] = sc.nextInt();
				i++;
            }
        }catch (FileNotFoundException ex){
            System.out.println("blad -> "+ex.toString());
        }
		i=0;
		try{
            Scanner sc = new Scanner(new File("czylosowac.txt"));
            while(sc.hasNextInt()){
                czylosowac[i] = sc.nextInt();
				i++;
            }
        }catch (FileNotFoundException ex){
            System.out.println("blad -> "+ex.toString());
        }
		for(i=0; i<10; i++){
			if(czylosowac[i] == 1){
				System.out.print(i+1+". Losuje "+ileliczb[i]+" liczb: ");
				for(j=0; j<ileliczb[i]; j++){
					System.out.print((int)(Math.random()*80+1)+" ");
				}
				System.out.println("");
			}else{
				System.out.println(i+1+". Wczytano liczbe 0, nie losuje liczby");
			}	
        }	
    }
}
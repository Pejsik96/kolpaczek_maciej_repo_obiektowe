import java.io.*;
import java.util.Random;
import java.util.Scanner;

class Tablica1{
    public static void main(String[] args){
        int i;
        String uczniowie[] = new String[10];
        int ocena[]=new int[10];
        for(i=0; i<10; i++){
            ocena[i] = (int)(Math.random()*6+1);
        }
        i=0;
        try{
            Scanner sc = new Scanner(new File("uczniowie.txt"));
            while(sc.hasNext()){
                uczniowie[i] = sc.nextLine();
                i++;
            }
        }catch (FileNotFoundException ex){
            System.out.println("blad -> "+ex.toString());
        }
        for(i=0; i<10; i++){
            System.out.println(uczniowie[i] +" "+  ocena[i]);
        }
    }
}
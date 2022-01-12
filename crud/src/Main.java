import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<UserData> lista = new ArrayList<>();
        int wybor=0;
        while(wybor!=5){
            Menu.menu();
            wybor=sc.nextInt();
            if(wybor==1){
                lista.add(AddData.insertData());
            }
            else if(wybor==2){
                ShowData.show(lista);
                SaveFile.saveData(lista);
            }
            else if(wybor==3){
                ModifyData.modifyData(lista);
            }
            else if(wybor==4){
                DeleteData.deleteData(lista);
            }
        }
    }
}
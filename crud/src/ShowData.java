import java.util.ArrayList;

public class ShowData {
    public static void show(ArrayList<UserData> lista){
        System.out.println("============================================");
        for(UserData i : lista){
            System.out.println(i);
        }
        System.out.println("============================================");
    }
}

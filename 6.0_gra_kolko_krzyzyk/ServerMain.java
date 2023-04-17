import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServerMain {
    static Game game;
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(1234);
            Socket socket = server.accept();
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            Scanner sc = new Scanner(System.in);
            File f = new File("history.txt");
            game = new Game();                        
            String sign1, sign2;
            int winner = 0;
            boolean playerTurn = false;
            boolean playing = true; 
            Random rand = new Random();
            int random = rand.nextInt(1);
            if(random == 0) {
                sign1 = "X";
                sign2 = "O";
            }
            else{
                sign1 = "O";
                sign2 = "X";
            }
            Player player1 = new Player("Gracz 1", sign1);
            Player player2 = new Player("Gracz 2", sign2);
            if(player1.getSign().equals("X")) playerTurn = true;
            while(playing) {
                String ruch = game.toString()+"\n"; 
                if(playerTurn) {
                    ruch += "Ruch "+player1.getName()+" ("+player1.getSign()+").";
                } else {
                    ruch += "Ruch "+player2.getName()+" ("+player2.getSign()+").";
                }
                out.writeUTF(ruch);
                String res = in.readUTF();
                int move=Integer.parseInt(res);
                while(move<1 || move>9) {
                    out.writeUTF("Niepoprawny ruchu\nPodaj pole do wstawienia");
                    res = in.readUTF();
                    move=Integer.parseInt(res);
                }
                int index = 0;
                if(move == 1){
                    index = 0; 
                } 
                if(move == 2){
                    index = 1;
                } 
                if(move == 3){
                    index = 2;
                } 
                if(move == 4){
                    index = 3;
                } 
                if(move == 5){
                    index = 4;
                } 
                if(move == 6){
                    index = 5;
                } 
                if(move == 7){
                    index = 6;
                } 
                if(move == 8){
                    index = 7;
                } 
                if(move == 9){
                    index = 8;
                } 
                String sign = player1.getSign();
                if(!playerTurn){
                    sign = player2.getSign(); 
                } 
                if(game.getSign(index).equals(" ")){
                    game.setSign(index, sign);
                }
                else{
                    playerTurn = !playerTurn;
                } 
                String winnerSign = null;       
                if(game.Win()) {
                    winnerSign = game.getWinner();
                    if(winnerSign.equals("remis")){
                        winner = 0;
                    } 
                    else if(player1.getSign().equals(winnerSign)){
                        winner = 1;
                    } 
                    else if(player2.getSign().equals(winnerSign)){
                        winner = 2;
                    } 
                    playing = false;
                } else{
                    playerTurn = !playerTurn;
                } 
            }
            FileWriter fw = new FileWriter(f, true); 
            String mess = "Wygral gracz ";
            String wynik = player1.getName()+" ("+player1.getSign()+") vs "+player2.getName()+" ("+player2.getSign()+")";
            if(winner == 0) {
                mess = "Remis";
                fw.write(wynik+" Remis \n");
            } else if(winner == 1) {
                mess += player1.getName();
                fw.write(wynik+" Wygral: "+player1.getName()+"\n");
            } else {
                mess += player2.getName();
                fw.write(wynik+" Wygral: "+player2.getName()+"\n");
            }
            out.writeUTF(game.toString()+"\n"+mess);
            fw.close();
            Scanner sc2 = new Scanner(f);
            String res = "";
            while (sc2.hasNextLine()) {
                res += sc2.nextLine()+"\n";
            }
            out.writeUTF(res);
            in.readUTF();
            
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private Player player1;
    private Player player2;
    /********************************************************
    * nazwa funkcji: Server
    * parametry wejściowe: boardSize
    * wartość zwracana: Brak, wybiera wielkosc planszy oraz nazwe graczy
    * autor: Maciek Kołpaczek
    * ****************************************************/
    public Server(int boardSize) {
        player1 = new Player(boardSize, "Koksy");
        player2 = new Player(boardSize, "Stelmaszyna");
    }
    /********************************************************
    * nazwa funkcji: start
    * parametry wejściowe: -
    * wartość zwracana: Brak, sterowanie procesem gry
    * autor: Maciek Kołpaczek
    * ****************************************************/
    public void start() {
        setupBoards();

        boolean gameInProgress = true;

        while (gameInProgress) {
            gameInProgress = playTurn(player1, player2);

            if (!gameInProgress) {
                System.out.println("Wszystkie statki przeciwnika rozpierdolone! \n Gracz 1 wygrał!");
                break;
            }

            gameInProgress = playTurn(player2, player1);

            if (!gameInProgress) {
                System.out.println("Wszystkie statki przeciwnika rozpierdolone! \n Gracz 2 wygrał!");
                break;
            }
        }
    }
    /********************************************************
    * nazwa funkcji: setupBoards
    * parametry wejściowe: nic?
    * wartość zwracana: tez nic bo statki ustawia po prostu
    * autor: Maciek Kołpaczek
    * ****************************************************/
    private void setupBoards() {
        System.out.println("Ustawianie statków gracza 1...");
        player1.placeShip(0, 0);
        player1.placeShip(0, 9);
        player1.placeShip(9, 0);
        player1.placeShip(9, 9);//Jednomasztowce
        player1.placeShip(1, 2);
        player1.placeShip(1, 3);
        player1.placeShip(6, 6);
        player1.placeShip(6, 7);
        player1.placeShip(8, 6);
        player1.placeShip(9, 6);//Dwumasztowce
        player1.placeShip(3, 1);
        player1.placeShip(3, 2);
        player1.placeShip(3, 3);
        player1.placeShip(2, 8);
        player1.placeShip(3, 8);
        player1.placeShip(4, 8);//Trojmasztowce
        player1.placeShip(6, 2);
        player1.placeShip(7, 2);
        player1.placeShip(8, 2);
        player1.placeShip(9, 2);//Czteromasztowiec


        System.out.println("Ustawianie statków gracza 2...");
        player2.placeShip(0, 0);
        player2.placeShip(0, 9);
        player2.placeShip(9, 0);
        player2.placeShip(9, 9);//Jednomasztowce
        player2.placeShip(1, 2);
        player2.placeShip(1, 3);
        player2.placeShip(6, 6);
        player2.placeShip(6, 7);
        player2.placeShip(8, 6);
        player2.placeShip(9, 6);//Dwumasztowce
        player2.placeShip(3, 1);
        player2.placeShip(3, 2);
        player2.placeShip(3, 3);
        player2.placeShip(2, 8);
        player2.placeShip(3, 8);
        player2.placeShip(4, 8);//Trojmasztowce
        player2.placeShip(6, 2);
        player2.placeShip(7, 2);
        player2.placeShip(8, 2);
        player2.placeShip(9, 2);//Czteromasztowiec
    }
    /********************************************************
    * nazwa funkcji: playTurn
    * parametry wejściowe: aktualny gracz i przeciwnik
    * wartość zwracana: główna funkcja w której dzieje sie cała magia ;) wojna itd!
    * autor: Maciek Kołpaczek and Kamil Ociepa
    * ****************************************************/
    private boolean playTurn(Player currentPlayer, Player opponentPlayer) {
        System.out.println("Plansza gracza "+currentPlayer.name+":");
        currentPlayer.getOwnBoard().printBoard();
        System.out.println("Plansza przeciwnika:");
        currentPlayer.getOpponentBoard().printBoard();

        int x = getInput("Podaj współrzędną X strzału: ");
        int y = getInput("Podaj współrzędną Y strzału: ");

        if (opponentPlayer.getOwnBoard().shoot(x, y)) {
            System.out.println("Trafiony!");
            opponentPlayer.getOwnBoard().markHit(x, y);
            currentPlayer.getOpponentBoard().markHit(x, y);

            if (opponentPlayer.getOwnBoard().allShipsDestroyed()) {
                return false; // Koniec gry
            }
        } else {
            System.out.println("Pudło!");
            opponentPlayer.getOwnBoard().markMiss(x, y);
            currentPlayer.getOpponentBoard().markMiss(x, y);
        }

        return true; // Gra w toku
    }

    private int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server(10);
        ServerSocket serverConn = new ServerSocket(1234);
        Socket socket = serverConn.accept();
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream());
        Scanner sc = new Scanner(System.in);
        server.start();
    }
}
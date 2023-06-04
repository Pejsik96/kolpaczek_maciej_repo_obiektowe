public class Board {
    private char[][] board;
    private int boardSize;

    public Board(int size) {
        boardSize = size;
        board = new char[boardSize][boardSize];
        initializeBoard();
    }
    /********************************************************
    * nazwa funkcji: initializeBoard
    * parametry wejściowe: brak
    * wartość zwracana: generuje mapke :D
    * autor: Kamil Ociepa
    * ****************************************************/
    private void initializeBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = '-';
            }
        }
    }
    /********************************************************
    * nazwa funkcji: printBoard
    * parametry wejściowe: nic
    * wartość zwracana: wyświetla mapke :O
    * autor: Ociepa Kamil
    * ****************************************************/
    public void printBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    /********************************************************
    * nazwa funkcji: placeShip
    * parametry wejściowe: wspolrzedna x i y
    * wartość zwracana: polozenie statku na planszy
    * autor: Kamil Ociepson?
    * ****************************************************/
    public void placeShip(int x, int y) {
        if (x >= 0 && x < boardSize && y >= 0 && y < boardSize) {
            board[x][y] = 'S';
        } else {
            System.out.println("Nieprawidłowe współrzędne statku.");
        }
    }
    /********************************************************
    * nazwa funkcji: shoot
    * parametry wejściowe: wspolrzedna x i y
    * wartość zwracana: oddaje strzał
    * autor: Maciek Kołpaczek
    * ****************************************************/
    public boolean shoot(int x, int y) {
        if (board[x][y] == 'S') {
            board[x][y] = 'H';
            return true;
        } else {
            board[x][y] = 'M';
            return false;
        }
    }
    /********************************************************
    * nazwa funkcji: allShipsDestroyed
    * parametry wejściowe: brak
    * wartość zwracana: sprawdza czy wszystkie statki zostaly zniszczone
    * autor: Kamil Ociepa
    * ****************************************************/
    public boolean allShipsDestroyed() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (board[i][j] == 'S') {
                    return false;
                }
            }
        }
        return true;
    }
    /********************************************************
    * nazwa funkcji: markHit
    * parametry wejściowe: wspolrzedna x i y
    * wartość zwracana: zaznacza trafienie na mapie
    * autor: Maciek Kołpaczek
    * ****************************************************/
    public void markHit(int x, int y) {
        board[x][y] = 'H';
    }
    /********************************************************
    * nazwa funkcji: markMiss
    * parametry wejściowe: wspolrzedna x i y
    * wartość zwracana: zaznacza pudło na mapie
    * autor: Maciek Kołpaczek
    * ****************************************************/
    public void markMiss(int x, int y) {
        board[x][y] = 'M';
    }
}
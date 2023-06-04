public class Player {
    private Board ownBoard;
    private Board opponentBoard;
    public String name;

    public Player(int boardSize, String name) {
        ownBoard = new Board(boardSize);
        opponentBoard = new Board(boardSize);
        this.name=name;
    }

    public void placeShip(int x, int y) {
        ownBoard.placeShip(x, y);
    }

    public boolean shoot(int x, int y) {
        return opponentBoard.shoot(x, y);
    }

    public boolean hasLost() {
        return ownBoard.allShipsDestroyed();
    }

    public Board getOwnBoard() {
        return ownBoard;
    }

    public Board getOpponentBoard() {
        return opponentBoard;
    }
}
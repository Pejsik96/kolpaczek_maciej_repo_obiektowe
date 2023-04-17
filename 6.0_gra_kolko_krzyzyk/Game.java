public class Game {
    private String[] board = {" ", " ", " ", " ", " ", " ", " ", " ", " "}; 
    private String winner = "";

    @Override
    public String toString() {
        String res = "--------------\n"+
                     " | "+board[0]+" | "+board[1]+" | "+board[2]+"\n"+
                     "--------------\n"+
                     " | "+board[3]+" | "+board[4]+" | "+board[5]+"\n"+
                     "--------------\n"+
                     " | "+board[6]+" | "+board[7]+" | "+board[8]+"\n";
        return res;
    }

    public boolean setSign(int index, String sign) {
        if(!sign.equals("X") && !sign.equals("O")) return false;
        if(index < 0 || index > 8) return false;
        if(!board[index].equals(" ")) return false; 
        board[index] = sign;

        return true;
    }

    public String getSign(int index) {
        if(index > 8 && index < 0) return null;
        return board[index];
    }

    public boolean Win() {

        if(checkLine(0, 1, 2)) return true;
        if(checkLine(3, 4, 5)) return true;
        if(checkLine(6, 7, 8)) return true;

        
        if(checkLine(0, 3, 6)) return true;
        if(checkLine(1, 4, 7)) return true;
        if(checkLine(2, 5, 8)) return true;


        if(checkLine(0, 4, 8)) return true;
        if(checkLine(2, 4, 6)) return true;

        if(checkDraw()) return true;

        return false;
    }
    private boolean checkLine(int a, int b, int c) {
        if(board[a].equals(" ") || board[b].equals(" ") || board[c].equals(" ")) return false;
        
        if(board[a].equals(board[b]) && board[b].equals(board[c])) {
            winner = board[a];
            return true;
        }
        return false;
    }

    private boolean checkDraw() {
        for (String place : board) {
            if(place.equals(" ")) {
                winner = "remis";
                return false;
            }
        }
        return true;
    }
    
    public String getWinner() {
        return winner;
    }
}

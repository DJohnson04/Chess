//this class handles the creation of the board and verifies the movement of pieces. 
public class Board {
    Piece[][] board = new Piece[8][8];

    public Board() {
        fillBoard();

    }
    /**
     * this method handles the filling of the board at the start of the game.
     */
    public void fillBoard() {
        board[0][0] = new Rook(true, 0);
        board[0][1] = new Knight(true, 1);
        board[0][2] = new Bishop(true, 2);
        board[0][3] = new Queen(true, 3);
        board[0][4] = new King(true, 4);
        board[0][5] = new Bishop(true, 5);
        board[0][6] = new Knight(true, 6);
        board[0][7] = new Rook(true, 7);
        board[0][8] = new Pawn(true, 8);
        board[0][1] = new Pawn(true, 9);
        board[0][1] = new Pawn(true, 10);
        board[0][1] = new Pawn(true, 11);
        board[0][1] = new Pawn(true, 12);
        board[0][1] = new Pawn(true, 13);
        board[0][1] = new Pawn(true, 14);
        board[0][1] = new Pawn(true, 15);
        board[0][1] = new Knight(true, 1);
        board[0][1] = new Knight(true, 1);
        board[0][1] = new Knight(true, 1);
        board[0][1] = new Knight(true, 1);
        board[0][1] = new Knight(true, 1);
        board[0][1] = new Knight(true, 1);
        board[0][1] = new Knight(true, 1);
        board[0][1] = new Knight(true, 1);
        board[0][1] = new Knight(true, 1);


;    }

    /**
     * Checks if either player is in checkmate by checking the valid moves of the kings
     * 
     * @return returns a integer, -1 if neither player is in checkmate, 0 if white is in checkmate, 1 if black is in checkmate. 
     */
    public int checkMate() {
        return -1;
    }
    
    public void checkInCheck() {

    }

    /**
     * checks if a piece is at the location specified.
     * 
     * @return Returns the piece
     */
    public void updateLocation(int location) {

    }
}
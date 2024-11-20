//this class handles the creation of the board and verifies the movement of pieces. 
public class Board {
    Piece[][] board = new Piece[8][8];

    /**
     * this method handles the filling of the board at the start of the game.
     */
    public void fillBoard() {
        
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
    public Piece checkLocation(int location) {

    }
}
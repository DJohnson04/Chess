//this class handles the creation of the board and verifies the movement of pieces. 
public class Board {
    // [0] [1] [2] [3] [4] [5] [6] [7]
    // [8] [9] [10] [11] [12] [13] [14] [15]
    // [16] [17] [18] [19] [20] [21] [22] [23]
    // [24] [25] [26] [27] [28] [29] [30] [31]
    // [32] [33] [34] [35] [36] [37] [38] [39]
    // [40] [41] [42] [43] [44] [45] [46] [47]
    // [48] [49] [50] [51] [52] [53] [54] [55]
    // [56] [57] [58] [59] [60] [61] [62] [63]
    // row = location/8 
    // column = location%8
    //                          c  r  
    Piece[][] board = new Piece[8][8];

    /**
     * initialize board
     */
    public Board() {
        fillBoard();
    }
    /**
     * this method handles the filling of the board at the start of the game.
     */
    public void fillBoard() {
        board[0][0] = new Rook(true, 0);
        board[1][0] = new Knight(true, 1);
        board[2][0] = new Bishop(true, 2);
        board[3][0] = new Queen(true, 3);
        board[4][0] = new King(true, 4);
        board[5][0] = new Bishop(true, 5);
        board[6][0] = new Knight(true, 6);
        board[7][0] = new Rook(true, 7);
        for (int i = 8; i < 16; i++) {
            board[i%8][1] = new Pawn(true, i);
        }
        
        for (int j = 48; j < 56; j++) {
            board[j%8][6] = new Pawn(true, j);
        }
        board[0][7] = new Rook(false, 56);
        board[1][7] = new Knight(false, 57);
        board[2][7] = new Bishop(false, 58);
        board[3][7] = new Queen(false, 59);
        board[4][7] = new King(false,60);
        board[5][7] = new Bishop(false, 61);
        board[6][7] = new Knight(false, 62);
        board[7][7] = new Rook(false, 63);
        
    }

    /**
     * returns piece at specified location 
     * @param location used to search the board
     * @return returns either the piece at the location or null
     */
    public Piece getPiece(int location) {
        int row = location/8;
        int column = location%8;
        if (board[column][row] != null) {
            return board[column][row];
        } else {
            return null;
        }
    }

    /**
     * Checks if either player is in checkmate by checking the valid moves of the kings
     * 
     * @return returns a integer, -1 if neither player is in checkmate, 0 if white is in checkmate, 1 if black is in checkmate. 
     */
    public int checkMate() {
        return -1;
    }
    
    public void checkInCheck() {
        return;
    }

    /**
     * Updates the board by deleting the original piece's location in the board,
     *  then setting the new location. // the calling method will check
     * 
     */
    public void updateLocation(Piece movingPiece, int newLocation, int oldLocation) {
        movingPiece.setLocation(newLocation);
        board[newLocation/8][newLocation%8] = movingPiece;
        board[oldLocation/8][oldLocation%8] = null;
    }
}
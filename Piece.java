//super class for types of pieces. 
public abstract class Piece {
    private boolean isBlack; // the color will be handles as a integer to easily read it. 0 is white and 1 is black
    public int location; //sets the location of the piece on the board

    public Piece(boolean color) {
        this(color, -1);
    }
    public Piece(boolean color, int location) {
    isBlack = color;

    }

    public abstract boolean possibleMoves()
    

    public abstract boolean canMove(Piece one, int location);
}
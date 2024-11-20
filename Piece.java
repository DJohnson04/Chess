//super class for types of pieces. 
public abstract class Piece {
    private boolean isBlack; 
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

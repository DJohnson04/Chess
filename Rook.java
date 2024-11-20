public class Rook extends Piece {
    
    public Rook(boolean color) {
        super(color);
    }
    
    public boolean canMove(Piece o, int location) {
        return true;
    }

    public boolean possibleMoves() {
        return true;
    }
}
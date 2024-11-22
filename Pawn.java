public class Pawn extends Piece {
    boolean firstMove = true;
    public Pawn(boolean color, int location) {
        super(color, location);
    }

    public boolean canMove( int location) {
        return true;
    }

    public int possibleMoves() {
        return -1;
    }

    public void move(int location) {

    }
}
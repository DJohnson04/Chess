public class Pawn extends Piece {
    boolean firstMove = true;
    public Pawn(int color, boolean firstMove) {
        super(color);
        this.firstMove = firstMove;
    }

    public boolean canMove(Piece o, int location) {
        return true;
    }

    public boolean possibleMoves() {
        return true;
    }
}
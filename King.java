public class King extends Piece {
    public King(boolean color, int location) {
        super(color, location);
    }
    
    public boolean canMove(int location) {
        return true;
    }

    public int possibleMoves() {
        return -1;
    }

    public void move(int location) {
        return;
    }
}
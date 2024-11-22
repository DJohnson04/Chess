public class Queen extends Piece {
    public Queen(boolean color, int location) {
        super(color, location);
    }
    
    public boolean canMove(int location) {
        return true;
    }

    public int[] possibleMoves() {
        return new int[0];
    }

    public void move(int location) {
        return;
    }
}
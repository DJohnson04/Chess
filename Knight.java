public class Knight extends Piece {
    public Knight(boolean isBlack, int location) {
        super(isBlack, location);
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
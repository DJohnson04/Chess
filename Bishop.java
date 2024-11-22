public class Bishop extends Piece {
    public Bishop(boolean isBlack, int location){
        super(isBlack, location);
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
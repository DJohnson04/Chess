public class Bishop extends Piece {
    public Bishop(boolean isBlack){
        super(isBlack);
    }
    
    public boolean canMove(Piece o, int location) {
        return true;
    }

    public boolean possibleMoves() {
        return true;
    }
}
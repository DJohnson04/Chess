//super class for types of pieces. 
public abstract class Piece {
    @SuppressWarnings("unused")
    private boolean isBlack; // the color will be handles as a integer to easily read it. 0 is white and 1 is black
    public int location; // the location of the piece on the board starting at 0 and going to 63;

    
    public Piece(boolean color, int location) {
        isBlack = color;
        this.location = location;
    }

    /**
     * lists the possible moves of a individual piece 
     * @return
     */
    public abstract int[] possibleMoves();
    

    /**
     * a verification method to check if a piece can move to a desired location
     * @param location self-explanatory 
     * @return returns boolean value(true for valid and false for invalid)
     */
    public abstract boolean canMove(int location);

    
    public abstract void move(int location);

    //needs to update the location of the piece moving, if there exist a piece that is not the same parity at the same location that piece will get removed. 
    public void move(int location) {
        
    }
}
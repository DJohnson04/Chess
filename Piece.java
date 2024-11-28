//super class for types of pieces. 
public abstract class Piece {

    @SuppressWarnings("unused")
    private boolean isBlack; // the color will be handles as a integer to easily read it. 0 is white and 1 is black
    private int location; // the location of the piece on the board starting at 0 and going to 63;
    
    static final Board b = new Board();
    
    public Piece(boolean color, int location) {
        isBlack = color;
        this.location = location;
    }

    /**
     * returns the location of the piece
     * @return
     */
    public int getLocation() {
        return location;
    }
    /**
     * sets the location of the piece
     * @param location
     */
    public void setLocation(int location) {
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


    /**
     * Moves one piece to a new location and potentially removes the taken piece(if it exists) 
     * @param newLocation the desired location for the current piece
     */
    public void move(int newLocation) {
        // outcome 2
        if (canMove(newLocation) == true) {
            b.updateLocation(this, newLocation, location);
        }
    }
}
public abstract class Piece {

    // Name of the pieces
    private String name;

    // X position of piece
    private int xPos;

    // Y position of piece
    private int yPos;

    // Constructor
    public Piece(String name) {
        this.name = name;
    }

    // validates moves
    public abstract boolean validateMove(int currX, int currY, int newX, int newY);

    // returns object name
    @Override
    public String toString() {
        return name;
    }

    // ### Getters and Setters ###
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}

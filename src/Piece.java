public abstract class Piece {

    // Name of the pieces
    private String name;

    // X position of piece
    private int xPos;

    // Y position of piece
    private int yPos;

    // Player ownership over piece
    private int userNum;

    // Constructor
    public Piece(String name) {
        this.name = name;
    }

    // validates moves
    public abstract boolean validateMove(int currX, int currY, int newX, int newY);

    // Checks if new move is on the board
    public boolean onBoard(int newX, int newY){
        if(newX < 0 || 7 < newX){
            return false;
        }
        if(newY < 0 || 7 < newY){
            return false;
        }
        if(xPos == newX && yPos == newY){ // If the new move is the same as the old placement, illegal
            return false;
        }

        return true;
    }

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

    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }
}

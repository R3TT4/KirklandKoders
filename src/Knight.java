public class Knight extends Piece {

    // Pawn constructor
    public Knight() {
        super("Knight");
    }

    // Validates move for pawn
    @Override
    public boolean validateMove(int currX, int currY, int newX, int newY) {
        if(!onBoard(newX, newY)){
            return false;
        }

        //must move linearly
        if(newX == currX && (newY == (currY + 1) || newY == (currY - 1))){
            return true;
        }
        return false;
    }

}

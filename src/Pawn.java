public class Pawn extends Piece {

    // Pawn constructor
    public Pawn(int userNum) {
        super("Pawn");
        setUserNum(userNum);
    }

    // Validates move for pawn
    @Override
    public boolean validateMove(int currX, int currY, int newX, int newY) {
        if(!onBoard(newX, newY)){
            return false;
        }

        //must move linearly
        if(newX == currX && (newY == (currY + 1))){
            return true;
        }
        return false;
    }

}

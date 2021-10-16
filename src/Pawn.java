public class Pawn extends Piece {

    // Pawn constructor
    public Pawn() {
        super("Pawn");
    }

    @Override
    public boolean validateMove(int currX, int currY, int newX, int newY) {
        if(!onBoard(newX, newY)){
            return false;
        }

        if(newX == (currX + 1) || newX == (currX - 1)){
            return true;
        }

        if(newY == (currY + 1) || newY == (currY - 1)){
            return true;
        }

        return false;
    }


}

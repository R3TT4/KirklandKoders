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

        //must move 2 then 1 or 1 then 2
        if(Math.abs(newX-currX) == 1 && Math.abs(newY-currY) == 2){
            return true;
        }
        if(Math.abs(newX-currX) == 2 && Math.abs(newY-currY) == 1){
            return true;
        }
        return false;
    }

}

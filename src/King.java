public class King extends Piece {

    public King(int userNum) {
        super("King");
        setUserNum(userNum);
    }

    // validates move for a rook
    @Override
    public boolean validateMove(int currX, int currY, int newX, int newY) {
        boolean validMove = false;

        // check first to see if the new move is even on the board
        if (onBoard(newX, newY) == false) {
            return false;
        }

        // checks to see if the new move is more than 1 block away from curr
        if (newX > currX + 1 || newY > currY + 1 || newY < currY - 1 || newX < currX - 1) {
            validMove = false;
        }
        else {
            validMove = true;
        }

        return validMove;
    }
}

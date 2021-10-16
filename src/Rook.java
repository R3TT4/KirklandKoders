public class Rook extends Piece {

    public Rook() {
        super("Rook");
    }

    // validates move for a rook
    @Override
    public boolean validateMove(int currX, int currY, int newX, int newY) {
        boolean validMove = false;
        // valid when x is same or y is same because that means straight line
        if (currX == newX || currY == newY) {
            validMove = true;
        }

        return validMove;
    }


}

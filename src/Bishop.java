public class Bishop extends Piece {

    // dvc
    public Bishop() {
        super("Bishop");
        setxPos(0);
        setyPos(0);
    }

    // evc
    public Bishop(int xPos, int yPos) {
        super("Bishop");
        setxPos(xPos);
        setyPos(yPos);
    }

    @Override
    public boolean validateMove(int currX, int currY, int newY, int newX) {
        // boolean canPlay = false;

        // checks if play can work
        if (currX == newX || currY == newY) {
            return true;
        }
        return false;
    }
}

public class Bishop extends Piece {

    // evc
    public Bishop(int userNum) {
        super("B");
        setUserNum(userNum);
    }

    @Override
    public boolean validateMove(int currX, int currY, int newY, int newX) {
        // this is for pushing branch to repository
        // boolean canPlay = false;

        // checks if play can work
        // bishop only goes diagonally

        if (Math.abs(currX - 1) == newX) {
            if (Math.abs(currY - 1) == newY || Math.abs(currY + 1) == newY) {
                return true;
            }
        }
        else if (Math.abs(currX + 1) == newX) {
            if (Math.abs(currY + 1) == newY || Math.abs(currY - 1) == newY) {
                return true;
            }
        }

        return false;
    }
}

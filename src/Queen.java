import java.lang.*;

public class Queen extends Piece
{
    boolean fairMove = false;

    public Queen (int userNum)
    {
        super("Q"); //name of piece
        setUserNum(userNum);
    }

    @Override
    public boolean validateMove(int currX, int currY, int newX, int newY)
    {
        boolean validMove = false;

        //checks if move is on board
        if (onBoard(newX, newY) == false) {
            return false;
        }

        // valid when x is same or y is same because that means straight line
        if (currX == newX || currY == newY) {
            validMove = true;
        }

        //move diagonal
        if(Math.abs(newX-currX) == Math.abs(newY-currY))
        {
            validMove = true;
        }

        return validMove;
    }
}

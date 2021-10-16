import java.lang.*;

public class Queen extends Piece
{
    boolean fairMove = false;

    public Queen ()
    {
        super("Queen"); //name of piece
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

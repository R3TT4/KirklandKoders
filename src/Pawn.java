public class Pawn extends Piece {

    // Pawn constructor
    public Pawn() {
        super("Pawn");
    }

    @Override
    public boolean validateMove(int currX, int currY, int newX, int newY) {
        return false;
    }
}

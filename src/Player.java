import java.util.ArrayList;
import java.util.List;

public class Player {

    // Keeps track of pieces taken
    private List<Piece> takenPieces = new ArrayList<>();

    // Player constructor
    public Player(int userNum) {
        // instantiates all the pieces
        Pawn pawn1 = new Pawn(userNum);
        Pawn pawn2 = new Pawn(userNum);
        Pawn pawn3 = new Pawn(userNum);
        Pawn pawn4 = new Pawn(userNum);
        Pawn pawn5 = new Pawn(userNum);
        Pawn pawn6 = new Pawn(userNum);
        Pawn pawn7 = new Pawn(userNum);
        Pawn pawn8 = new Pawn(userNum);
        Pawn pawn9 = new Pawn(userNum);
        Pawn pawn10 = new Pawn(userNum);
        Rook rook1 = new Rook(userNum);
        Rook rook2 = new Rook(userNum);
        Bishop bishop1 = new Bishop(userNum);
        Bishop bishop2 = new Bishop(userNum);
        Knight knight1 = new Knight(userNum);
        Knight knight2 = new Knight(userNum);
        Queen queen = new Queen(userNum);
        King king = new King(userNum);
    }

}

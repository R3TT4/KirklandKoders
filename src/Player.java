import java.util.ArrayList;
import java.util.List;

public class Player {

    // Keeps track of pieces taken
    private List<Piece> takenPieces = new ArrayList<>();

    // Keeps track of the pieces of the player
    private List<Piece> userPieces = new ArrayList<>();

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

        // Add the pieces to the user
        addToUser(pawn1);
        addToUser(pawn2);
        addToUser(pawn3);
        addToUser(pawn4);
        addToUser(pawn5);
        addToUser(pawn6);
        addToUser(pawn7);
        addToUser(pawn8);
        addToUser(pawn9);
        addToUser(pawn10);
        addToUser(rook1);
        addToUser(knight1);
        addToUser(bishop1);
        addToUser(queen);
        addToUser(king);
        addToUser(bishop2);
        addToUser(knight2);
        addToUser(rook2);
    }

    // Adds a piece to the taken list
    public void addToTaken(Piece piece){
        takenPieces.add(piece);
    }

    // Instantiates the list of pieces that the user already has
    public void addToUser(Piece piece){
        userPieces.add(piece);
    }

    public List<Piece> getTakenPieces() {
        return takenPieces;
    }

    public List<Piece> getUserPieces() {
        return userPieces;
    }
}

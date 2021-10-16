import java.util.Arrays;

public  class Board {

    private Piece[][] board = new Piece[10][10];

    // Constructor
    public Board(){
        Player player0 = new Player(0);
        Player player1 = new Player(1);
    }

    // Method to move a piece
    // first makes sure that move is valid then completes move
    // returns whether or not the move was successful
    public boolean move(Piece piece, int newX, int newY) {
        boolean validMove = piece.validateMove(piece.getxPos(), piece.getyPos(), newX, newY);
        if (validMove == false) {
            return false;
        }

        board[piece.getyPos()][piece.getxPos()] = null;
        board[newY][newX] = piece;

        return validMove;
    }

    public void takePiece(){
        // need to do
    }

    /*  TODO: takePiece (take piece if there is an opponent piece in the new space)
        TODO: make sure pieces cant overlap
        TODO: inCheck (see if king is in check by looking at surrounding pieces and their movement paths)
        TODO: inCheckMate (similar to in check but checks if can move to any surrounding space)
        TODO: Figure out if going to actually use gui or stick with command line
        TODO: more stuff i guess lmao
    */

}


/*
public class Board {
    private Piece[][] board;

    // example of board running
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board);
    }

    public Board() {
        board = new Piece[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = null;
            }
        }

//        rook = new Rook();
//        board[4][2] = rook;
    }

    // first makes sure that move is valid then completes move
    // returns whether or not the move was successful
    public boolean move(Piece piece, int newY, int newX) {
        boolean validMove = piece.validateMove(piece.getxPos(), piece.getyPos(), newX, newY);
        if (validMove == false) {
            return false;
        }

        board[piece.getyPos()][piece.getxPos()] = null;
        board[newY][newX] = piece;

        return validMove;
    }

    @Override
    public String toString() {
        String board_string = "";
        int level = 7;

        for (int i = 7; i >= 0; i--) {
            board_string += level + " ";
            for (int j = 0; j <= 7; j++) {

                if (board[i][j] == null) {
                    board_string += "[ ] ";
                }

                // CHANGE TO DO THE PIECE CHAR, NOT JUST R
                else {
                    board_string += "[R] ";
                }
            }
            board_string += "\n";
            level += -1;
        }

        board_string += "   ";
        for (int j = 0; j <= 7; j++) {
            board_string += j + "   ";
        }

        return board_string;
    }

}
*/
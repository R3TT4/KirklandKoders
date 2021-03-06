// whenever x is talked about that is the column position, y is the row position
// so board[y][x] since rows are first before colummns

import java.util.Arrays;
import java.util.Scanner;

public  class Board {

    private Piece[][] board = new Piece[10][10];

    Player player1 = new Player(1);
    Player player2 = new Player(2);

    // Constructor
    public Board(){
        //set all spots on board null
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = null;
            }
        }
        fillBoard();
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

    // Fill the board for the start of the game
    public void fillBoard(){
        // Fill player 1 side first
        int elementTracker = 0; //keeps track of the element in the array list to iterate from halfway through
        for (int i = 0; i < board.length; i++){
            board[8][i] = player1.getUserPieces().get(i);
            elementTracker++;
        }
        for (int i = 1; i < board.length - 1; i++){
            board[9][i] = player1.getUserPieces().get(elementTracker);
            elementTracker++;
        }

        // Fill player 2 pieces
        elementTracker = 0;
        for (int i = 0; i < board.length; i++){
            board[1][i] = player2.getUserPieces().get(i);
            elementTracker++;
        }
        for (int i = 1; i < board.length - 1; i++){
            board[0][i] = player2.getUserPieces().get(elementTracker);
            elementTracker++;
        }

    }

    /*  TODO: takePiece (take piece if there is an opponent piece in the new space)
        TODO: make sure pieces cant overlap
        TODO: inCheck (see if king is in check by looking at surrounding pieces and their movement paths)
        TODO: inCheckMate (similar to in check but checks if can move to any surrounding space)
        TODO: Figure out if going to actually use gui or stick with command line
        TODO: more stuff i guess lmao
    */

    @Override
    public String toString() {
        String board_string = "";
        int level = 9;

        for (int i = 9; i >= 0; i--) {
            board_string += level + " ";
            for (int j = 0; j <= 9; j++) {

                if (board[i][j] == null) {
                    board_string += "[ ] ";
                }

                // CHANGE TO DO THE PIECE CHAR, NOT JUST R
                else {
                    // Prints player 1 style if player 1 piece
                    for(int k = 0; k < player1.getUserPieces().size(); k++){
                        if(board[i][j] == player1.getUserPieces().get(k)){
                            board_string += "(" + board[i][j].toString() + ") ";
                        }
                    }
                    // Prints player 2 style is player 2 piece
                    for(int k = 0; k < player2.getUserPieces().size(); k++){
                        if(board[i][j] == player2.getUserPieces().get(k)){
                            board_string += "{" + board[i][j].toString() + "} ";
                        }
                    }

                }
            }
            board_string += "\n";
            level += -1;
        }

        board_string += "   ";
        for (int j = 0; j <= 9; j++) {
            board_string += j + "   ";
        }

        return board_string;
    }

    // Method to print board with player particularities
    public void printBoard(){
        String pieceString1 = "";
        for(int k = 0; k < player1.getTakenPieces().size(); k++){
            pieceString1 += "(" + player1.getTakenPieces().get(k).toString() + ") ";
        }

        String pieceString2 = "";
        for(int k = 0; k < player2.getTakenPieces().size(); k++){
            pieceString2 += "(" + player2.getTakenPieces().get(k).toString() + ") ";
        }
        System.out.println("Player 1");
        System.out.println("Taken Pieces: " + pieceString1);
        System.out.println("-----------------------------------------");
        System.out.println(this.toString());
        System.out.println("-----------------------------------------");
        System.out.println("Player 2");
        System.out.println("Taken Pieces: " + pieceString2);
    }

    // param userTurn gives the int relating to which user's turn it is
    // right now it just checks to make sure the piece thats gets selected is the player's
    public void move(int userTurn) {
        Player playerTurn = null;
        String playerString = "";
        if (userTurn == 1) {
            playerTurn = player1;
            playerString = "Player 1";
        }

        else if (userTurn == 2) {
            playerTurn = player2;
            playerString = "Player 2";
        }

        boolean validPiece = false;
        System.out.println("It is " + playerString + "'s turn.");
        Scanner kb = new Scanner(System.in); // used to get user input from terminal

        while (validPiece == false) {
            System.out.println("Please enter the location of which piece you would like to move.");
            System.out.println("Enter the location as (Row)(Col) with no spaces. ex. 25");
            int pieceLoc = kb.nextInt();
            int pieceRow = pieceLoc / 10;
            int pieceCol = pieceLoc % 10;

            if (pieceLoc < 0 || pieceLoc > 99) {
                continue; // invalid location
            }

            Piece chosenPiece = board[pieceRow][pieceCol];
            if (chosenPiece == null || chosenPiece.getUserNum() != userTurn) {
                continue; // invalid location
            }

            validPiece = true;
            System.out.println(chosenPiece.toString());
        }
    }
}
import java.util.Arrays;

public class Board {
    private int[][] board;

    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board);
    }

    public Board() {
        board = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = -1;
            }
        }
    }

    @Override
    public String toString() {
        String board_string = "";
        int level = 8;

        for (int i = 0; i < 8; i++) {
            board_string += level + " ";
            for (int j = 0; j < 8; j++) {

                if (board[i][j] == -1) {
                    board_string += "[ ] ";
                }
            }
            board_string += "\n";
            level += -1;
        }

        board_string += "   ";
        for (int j = 1; j <= 8; j++) {
            board_string += "1   ";
        }

        return board_string;
    }

}

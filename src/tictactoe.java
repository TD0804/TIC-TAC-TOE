
public class tictactoe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        System.out.println("Is move (1, 1) valid? " + isValidMove(1, 1));
    }

    static boolean isValidMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            if (board[row][col] == '-') {
                return true;
            } else {
                System.out.println("Validation Error: Cell is already occupied.");
                return false;
            }
            
        } else {
            System.out.println("Validation Error: Move is out of board boundaries.");
            return false;
        }
    }
}
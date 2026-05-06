import java.util.Random;

public class tictactoe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();
    }

    static void computerMove() {
        Random random = new Random();
        int slot, row, col;
        boolean moved = false;

        System.out.println("Computer is making a move...");

        do {
            slot = random.nextInt(9) + 1;
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            if (isValidMove(row, col)) {
                placeMove(row, col, computerSymbol);
                System.out.println("Computer placed '" + computerSymbol + "' in slot " + slot);
                moved = true;
            }
            
        } while (!moved);
    }

    static boolean isValidMove(int row, int col) {
        return board[row][col] == '-';
    }

    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}
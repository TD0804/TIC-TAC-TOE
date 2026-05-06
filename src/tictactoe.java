
public class tictactoe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        placeMove(0, 0, 'X');
        System.out.println("Value at board[0][0]: " + board[0][0]);
    }

    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}
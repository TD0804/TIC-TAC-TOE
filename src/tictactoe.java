
public class tictactoe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {
        
        while (!gameOver) {
            
            if (isHumanTurn) {
                System.out.println("--- Human Player's Turn ---");
                isHumanTurn = false; 
            } else {
                System.out.println("--- Computer's Turn ---");
                // computerMove();
                
                isHumanTurn = true;
            }
            gameOver = true; 
        }
        
        System.out.println("Game Over!");
    }
}
import java.util.Scanner;


public class tictactoe {

    public static void main(String[] args) {
        int slot = getUsersSlot();
        System.out.println("Slot entered: " + slot);
    }

    static int getUsersSlot() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a slot number (1-9): ");
        
        int slot = sc.nextInt();
        return slot;
    }
}
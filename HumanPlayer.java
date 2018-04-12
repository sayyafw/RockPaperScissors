import java.util.HashMap;
import java.util.Scanner;

public class HumanPlayer implements RPSPlayable {

    private Scanner scanner;

    public HumanPlayer(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getMove(HashMap<String, Integer> moves) {
        String move;
        while(true) {
            try {
                System.out.println("Please input your move: ");
                move = scanner.next().trim().toLowerCase();
                if (moves.containsKey(move)) {
                    break;
                } else {
                    System.out.println("Your input " + move + " was invalid, please try again!");
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("You played " + move);
        return move;
    }





}

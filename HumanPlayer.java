import java.util.HashMap;
import java.util.Scanner;

/**
 * The HumanPlayer class parses and validates the human players move responses
 * and returns their move.
 */

public class HumanPlayer implements RPSPlayable {

    private Scanner scanner;

    public HumanPlayer(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Function receives and parses user input and returns their move
     * @param moves defines the valid move set in the game
     * @return the player move
     */
    @Override
    public String getMove(HashMap<String, Integer> moves) {
        String move;
        //The loop continues to run while user sends invalid inputs
        while(true) {
            try {
                System.out.println("Please input your move: ");
                move = scanner.next().trim().toLowerCase();
                //Checks if input is one of rock, paper or scissors
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

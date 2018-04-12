import java.util.Scanner;

/**
 * Main driver class that runs the game
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numGames;

        //Makes sure that user input for numGames is actually an integer before proceeding
        while(true) {
            System.out.println("Please input how many times you want to play: ");
            try {
                numGames = scanner.nextInt();
                break;
            } catch(Exception e) {
                System.out.println("Invalid input, please try again!");
                scanner.next();
            }
        }
        RockPaperScissors game = new RockPaperScissors(numGames, scanner);
        game.playGame();
    }
}

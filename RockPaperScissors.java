import java.util.HashMap;
import java.util.Scanner;

/**
 *  The game class. Creates the human and player objects to represent the two parties playing.
 */
public class RockPaperScissors {

    //Hashmap to hold all possible moves in the game
    private HashMap<String, Integer> moves = new HashMap<>();
    private int numGames, humanWins = 0, compWins = 0;
    private HumanPlayer human;
    private ComputerPlayer computer;

    public RockPaperScissors(int n, Scanner scanner) {

        //populate the map and create human and computer objects.
        moves.put("rock", 0);
        moves.put("paper", 1);
        moves.put("scissors", 2);
        numGames = n;
        this.human = new HumanPlayer(scanner);
        this.computer = new ComputerPlayer();
    }

    /**
     * Method that controls the flow of the game. Runs for the number of games the user wants to play
     * before printing final scores
      */
    public void playGame() {
        for(int i =0; i < numGames; i++) {
            String humanMove = human.getMove(moves);
            String computerMove = computer.getMove(moves);
            checkWinner(humanMove, computerMove);
        }

        printFinalScores();
    }

    /**
     * Helper function to check all win lose or tie conditions in the game, and increments the necessary counters
     * @param humanMove defines the move the human player made
     * @param computerMove defines the move the computer made
     */
    public void checkWinner(String humanMove, String computerMove) {

        if(humanMove.equals(computerMove)) {
            System.out.println("It's a tie!");
        }

        else {
            if(humanMove.equals("rock")) {
                if(computerMove.equals("paper")) {
                    System.out.println("You Lose!");
                    compWins++;
                }

                if(computerMove.equals("scissors")) {
                    System.out.println("You Win!");
                    humanWins++;
                }
            }

            if(humanMove.equals("paper")) {
                if(computerMove.equals("scissors")) {
                    System.out.println("You Lose!");
                    compWins++;
                }

                if(computerMove.equals("rock")) {
                    System.out.println("You Win!");
                    humanWins++;
                }
            }

            if(humanMove.equals("scissors")) {
                if(computerMove.equals("rock")) {
                    System.out.println("You Lose!");
                    compWins++;
                }

                if(computerMove.equals("paper")) {
                    System.out.println("You Win!");
                    humanWins++;
                }
            }
        }
    }

    /**
     * Prints the final scores of the two playing entities
     */
    private void printFinalScores() {
        System.out.println();
        for(int i = 0; i < 10; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("You Won " + humanWins + " Games!");
        System.out.println("The Computer Won " + compWins + " Games!");
    }


    public HashMap<String, Integer> getMoves() {
        return moves;
    }

    public void setMoves(HashMap<String, Integer> moves) {
        this.moves = moves;
    }

    public int getNumGames() {
        return numGames;
    }

    public void setNumGames(int numGames) {
        this.numGames = numGames;
    }

    public int getHumanWins() {
        return humanWins;
    }

    public void setHumanWins(int humanWins) {
        this.humanWins = humanWins;
    }

    public int getCompWins() {
        return compWins;
    }

    public void setCompWins(int compWins) {
        this.compWins = compWins;
    }

    public HumanPlayer getHuman() {
        return human;
    }

    public void setHuman(HumanPlayer human) {
        this.human = human;
    }

    public ComputerPlayer getComputer() {
        return computer;
    }

    public void setComputer(ComputerPlayer computer) {
        this.computer = computer;
    }
}

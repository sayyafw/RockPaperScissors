import java.util.HashMap;
import java.util.Scanner;

public class RockPaperScissors {

    private HashMap<String, Integer> moves = new HashMap<>();
    private int numGames, humanWins = 0, compWins = 0;
    private HumanPlayer human;
    private ComputerPlayer computer;

    public RockPaperScissors(int n, Scanner scanner) {
        moves.put("rock", 0);
        moves.put("paper", 1);
        moves.put("scissors", 2);
        numGames = n;
        this.human = new HumanPlayer(scanner);
        this.computer = new ComputerPlayer();    }

    public void playGame() {

        for(int i =0; i < numGames; i++) {
            String humanMove = human.getMove(moves);
            String computerMove = computer.getMove(moves);
            checkWinner(humanMove, computerMove);
        }

        printFinalScores();
    }


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

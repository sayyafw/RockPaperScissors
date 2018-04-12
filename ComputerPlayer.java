import java.util.HashMap;
import java.util.Random;

/**
 * Creates the class to represent the computer player entity
 */
public class ComputerPlayer extends PlayingEntity {

    public ComputerPlayer() {
        super();
    }

    /**
     * Gets the computer move as a random integer mapped to the keys of the valid move set
     * @param moves defines the valid move set in the game
     * @return the computer move
     */
    @Override
    public String getMove(HashMap<String, Integer> moves) {
        //gets value of move between 0 and 2 as set in the hashmap
        int moveType = new Random().nextInt(3);
        String move = "";
        //Loop checks value for its corresponding key in the hashmap
        for(String key : moves.keySet()) {
            if(moves.get(key) == moveType) {
                move = key;
            }
        }
        System.out.println("The computer played " + move);
        return move;
    }
}


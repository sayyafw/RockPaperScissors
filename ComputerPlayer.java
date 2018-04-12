import java.util.HashMap;
import java.util.Random;

public class ComputerPlayer implements RPSPlayable {

    public ComputerPlayer() {
    }

    @Override
    public String getMove(HashMap<String, Integer> moves) {
        int moveType = new Random().nextInt(3);
        String move = "";
        for(String key : moves.keySet()) {
            if(moves.get(key) == moveType) {
                move = key;
            }
        }

        System.out.println("The computer played " + move);
        return move;
    }
}


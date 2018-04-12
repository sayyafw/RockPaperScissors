import java.util.HashMap;

/**
 * Superclass for all playing entities in the game.
 * Used to defined a standardised behaviour for all playing entities
 */
public abstract class PlayingEntity {

    public PlayingEntity() {
    }

    public abstract String getMove(HashMap<String, Integer> moves);
}

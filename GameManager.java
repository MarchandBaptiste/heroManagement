import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private List<Character> characters;
    private static GameManager instance;

    private GameManager() {
        this.characters = new ArrayList<>();
    }

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }
}
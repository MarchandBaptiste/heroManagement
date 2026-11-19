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

    public Character createCharacter(CharacterType type, String name, int strength, int mana, int range) {
        Character newCharacter = null;

        switch (type) {
            case CharacterType.WARRIOR -> newCharacter = new Warrior(name, strength);
            case CharacterType.MAGE -> newCharacter = new Mage(name, mana);
            case CharacterType.ARCHER -> newCharacter = new Archer(name, range);
            default -> {
            }
        }

        if (newCharacter != null) {
            this.characters.add(newCharacter);
        }
        return newCharacter;
    }
}
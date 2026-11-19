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

    /**
     * Crée un personnage et l'enregistre dans la liste
     *
     * @param type le type du personnage (WARRIOR, MAGE, ARCHER)
     * @param name le nom du personnage
     * @return le personnage créé
     */
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

    /**
     * Lance un combat entre deux personnages.
     * Les personnages s'attaquent à tour de rôle jusqu'à ce qu'un des deux n'ait
     * plus de points de vie.
     * 
     * @param hero1 premier combattant
     * @param hero2 second combattant
     * @return Message décrivant le résultat du combat
     */
    public String startBattle(Character hero1, Character hero2) {
        if (hero1 == null || hero2 == null) {
            return "Le combat ne peut pas commencer il manque un personnage";
        }
        int tour = 1;
        while (hero1.getHealth() > 0 && hero2.getHealth() > 0) {
            Character attaquant = (tour % 2 == 1) ? hero1 : hero2;
            Character cible = (tour % 2 == 1) ? hero2 : hero1;
            System.out
                    .println("--- Tour " + tour + " : " + attaquant.getName() + " attaque " + cible.getName());
            System.out.println(attaquant.attack(cible));
            tour++;
        }
        Character gagnant = hero1.getHealth() > 0 ? hero1 : hero2;
        Character perdant = hero1.getHealth() > 0 ? hero2 : hero1;
        return gagnant.getName() + " remporte le combat contre " + perdant.getName();
    }

}
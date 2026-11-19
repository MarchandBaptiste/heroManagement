import java.util.Random;

public class Mage extends Character {
    private int mana;

    public Mage(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    @Override
    public String attack(Character target) {
        int totalDamage = 5 + mana;
        target.takeDamage(totalDamage);
        return "Le joueur attaqué est : " + target + " et il prend " + totalDamage + " de dégats.";
    }

    /**
     * Pour lancer un sort
     * 
     * @return Message décrivant le sort envoyer
     */
    public String castSpell() {
        mana += 10;
        String[] spells = { "attaque", "étourdissement" };
        Random random = new Random();
        String chosenSpell = spells[random.nextInt(spells.length)];
        return "Le sort envoyé est un sort de : " + chosenSpell;
    }
}

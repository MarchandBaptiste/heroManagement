public class Warrior extends Character {
    private int strength;

    public Warrior(String name, int health, int strength) {
        super(name, health);
        this.strength = strength;
    }

    @Override
    public String attack(Character target) {
        target.takeDamage(5);
        return "Le joueur attaqué est : " + target + " et il prend 5 de dégats.";
    }
}


public class Archer extends Character {
    private int range;

    public Archer(String name, int health, int range) {
        super(name, health);
        this.range = range;
    }

    @Override
    public String attack(Character target) {
        int Damage = 5;
        target.takeDamage(Damage);
        return "Le joueur attaqué est : " + target + " et il prend " + Damage + " de dégats.";
    }

    /**
     * Pour tirer des flèches
     * 
     * @return Message sur la distance max d'une attaque
     */
    public String castSpell() {
        range += 200;
        return "Les flèches envoyer on une distance max de : " + range;
    }
}

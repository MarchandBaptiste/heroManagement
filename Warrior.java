public class Warrior extends Character {
    private int strength;

    public Warrior(String name, int health, int strength) {
        super(name, health);
        this.strength = strength;
    }

    @Override
    public String attack(Character target) {
        int totalDamage = 5 + strength;
        target.takeDamage(totalDamage);
        return "Le joueur attaqué est : " + target + " et il prend " + totalDamage + " de dégats.";
    }

    /**
     * Pour une attaque puissante
     * 
     * @return Message décrivant le nombre de dégats infligé en +
     */
    public String charge() {
        strength += 10;
        return "Prochaine attaque charger + 10 dégats à venir !";
    }
}

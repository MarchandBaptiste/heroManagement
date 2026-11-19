public abstract class Character {
    protected String name;
    protected int health;
    protected int Level;

    public Character(String name) {
        this.name = name;
        this.health = 50;
        this.Level = 1;
    }

    /**
     * Attaque un personnage cible
     *
     * @param target La cible
     * @return Message décrivant l'attaque
     */
    public abstract String attack(Character target);

    /**
     * Blesse un personnage cible
     *
     * @param amount Niveau d'attaque
     * @return Message décrivant le résultat de l'attaque
     */
    public String takeDamage(int amount) {
        if (health <= 0) {
            return "Le joueur est déjà mort";
        }
        health -= amount;
        if (health < 0) {
            health = 0;
        }
        return name + " prend " + amount + " dégâts. Sa vie est de : " + health;
    }

    public String getName() {
        return name;
    }
}
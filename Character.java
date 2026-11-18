public abstract class Character {
    protected String name;
    protected int health;
    protected int Level;

    public Character(String name, int health, int Level) {
        this.name = name;
        this.health = health;
        this.Level = 1;
    }
}
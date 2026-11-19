public class Main {
    public static void main(String[] args) {
        GameManager gm = GameManager.getInstance();
        Character schwarzenegger = gm.createCharacter(CharacterType.WARRIOR, "Schwarzenegger", 10, 0, 0);
        Character merlin = gm.createCharacter(CharacterType.MAGE, "Merlin", 0, 50, 0);
        Character legolas = gm.createCharacter(CharacterType.ARCHER, "Legolas", 0, 0, 100);
        System.out.println(schwarzenegger.getName() + " : " + schwarzenegger.getHealth() + " PV");
        System.out.println(merlin.getName() + " : " + merlin.getHealth() + " PV\n");
        String resultat = gm.startBattle(schwarzenegger, merlin);
        System.out.println(resultat);
        System.out.println("\n");
    }
}

public class Main {
    public static void main(String[] args) {
        GameManager gm = GameManager.getInstance();
        Character schwarzenegger = gm.createCharacter(CharacterType.WARRIOR, "Schwarzenegger", 10, 0, 0);
        Character merlin = gm.createCharacter(CharacterType.MAGE, "Merlin", 0, 50, 0);
        Character legolas = gm.createCharacter(CharacterType.ARCHER, "Legolas", 0, 0, 100);
        System.out.println(schwarzenegger.getName() + " : " + schwarzenegger.getHealth() + " PV");
        System.out.println(merlin.getName() + " : " + merlin.getHealth() + " PV\n");
        Sword epee = new Sword();
        Wand baguette = new Wand();
        Bow arc = new Bow();
        System.out.println(epee.equip(schwarzenegger));
        System.out.println("Force de Schwarzenegger après épée : " + ((Warrior) schwarzenegger).getStrength());
        System.out.println(baguette.equip(merlin));
        System.out.println("Mana de Merlin après baguette : " + ((Mage) merlin).getMana());
        System.out.println(arc.equip(legolas));
        System.out.println("Portée de Legolas après arc : " + ((Archer) legolas).getRange());
        System.out.println(epee.equip(merlin));
        System.out.println("\n");
        String resultat = gm.startBattle(schwarzenegger, merlin);
        System.out.println(resultat);
    }
}

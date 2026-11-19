public class Sword implements Equipable {
    private static final int STRENGTH_BONUS = 10;

    @Override
    public String equip(Character character) {
        if (character instanceof Warrior) {
            Warrior warrior = (Warrior) character;
            warrior.setStrength(warrior.getStrength() + STRENGTH_BONUS);
            return character.getName() + " est maintenant équipé d'une épée (+" + STRENGTH_BONUS + " force).";
        }
        return character.getName() + " ne peut pas équiper cette épée (réservé aux guerriers)";
    }
}

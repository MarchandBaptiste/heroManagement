public class Bow implements Equipable {
    private static final int RANGE_BONUS = 20;

    @Override
    public String equip(Character character) {
        if (character instanceof Archer) {
            Archer archer = (Archer) character;
            archer.setRange(archer.getRange() + RANGE_BONUS);
            return character.getName() + " est maintenant équipé d'un arc (+" + RANGE_BONUS + " portée).";
        }
        return character.getName() + " ne peut pas équiper cet arc (réservé aux archers)";
    }
}

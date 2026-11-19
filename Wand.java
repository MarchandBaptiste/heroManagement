public class Wand implements Equipable {
    private static final int MANA_BONUS = 20;

    @Override
    public String equip(Character character) {
        if (character instanceof Mage) {
            Mage mage = (Mage) character;
            mage.setMana(mage.getMana() + MANA_BONUS);
            return character.getName() + " est maintenant équipé d'une baguette magique (+" + MANA_BONUS + " mana).";
        }
        return character.getName() + " ne peut pas équiper cette baguette (réservé aux mages)";
    }
}

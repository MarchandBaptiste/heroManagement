public class Sword implements Equipable{
    @Override 
    public String equip(Character character){
        return character.getName() + "le personnage est maintenant équiper d'une épée";
    }
}

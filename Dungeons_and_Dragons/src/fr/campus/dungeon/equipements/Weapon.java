package fr.campus.dungeon.equipements;

import fr.campus.dungeon.characters.Warrior;
import fr.campus.dungeon.characters.Magician;
import fr.campus.dungeon.characters.Character;

public class Weapon extends OffensiveGear {
    public Weapon(String weaponsName, String attackingEquipment, int damage) {
        super(weaponsName, attackingEquipment, damage);
    }

}

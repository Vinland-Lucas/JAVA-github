package fr.campus.dungeon.characters;

import fr.campus.dungeon.equipements.OffensiveGear;
import fr.campus.dungeon.equipements.Shield;
import fr.campus.dungeon.equipements.Weapon;

public class Warrior extends Character {
    public Warrior(String type, String name) {
        super(type, name);
        setLifePoints(10);
        setOffensiveGear(new Weapon());
        setDefensiveGear(new Shield());
    }


}

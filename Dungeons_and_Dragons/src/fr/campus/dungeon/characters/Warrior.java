package fr.campus.dungeon.characters;

import fr.campus.dungeon.equipements.OffensiveGear;
import fr.campus.dungeon.equipements.DefensiveGear;
import fr.campus.dungeon.equipements.Shield;
import fr.campus.dungeon.equipements.Weapon;

public class Warrior extends Character {
    public Warrior(String type, String name) {
        super(type, name);
        characterFeatures();
    }

    public void characterFeatures() {
        setLifePoints(10);
        setStrength(10);
        setOffensiveGear(new Weapon("Senbonzakura", "Weapon", 10));
        setDefensiveGear(new Shield("Jadis", "Shield", 10));
    }

}

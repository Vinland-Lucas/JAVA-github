package fr.campus.dungeon.characters;

import fr.campus.dungeon.equipements.OffensiveGear;
import fr.campus.dungeon.equipements.DefensiveGear;
import fr.campus.dungeon.equipements.Philter;
import fr.campus.dungeon.equipements.Spell;

public class Magician extends Character{

    public Magician(String type, String name) {
        super(type, name);
        characterFeatures();
    }

    public void characterFeatures() {
        setLifePoints(5);
        setStrength(15);
        setOffensiveGear(new Spell("Katon", "Spell", 15));
        setDefensiveGear(new Philter("Philtrum", "Philtre", 10));
    }
}

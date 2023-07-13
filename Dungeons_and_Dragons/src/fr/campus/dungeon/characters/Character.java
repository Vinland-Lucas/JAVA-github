package fr.campus.dungeon.characters;

import fr.campus.dungeon.equipements.OffensiveGear;
import fr.campus.dungeon.equipements.DefensiveGear;

public class Character {
    // On crée les Instance Fields ou Instance Variables de notre class
   private String characterType;
   private String name;
   private int lifePoints;
   private String defaultOffensiveWeapon;
   private String defensiveWeapon;

    // On crée le constructeur (on peut en avoir plusieurs dans une même class)
    public Character() {

    }

    public Character(String characterName) {
        this.name = characterName;
    }

    public Character(String type, String characterName) {
        this.characterType = type;
        this.name = characterName;

        if (type.equals("Warrior")) {
            this.lifePoints = 10;
            OffensiveGear attackStuff = new OffensiveGear("Senbonzakura", "Weapon", 10);
            DefensiveGear defenseStuff = new DefensiveGear("Jadis", "Shield", 10);
        } else if (type.equals("Magician")) {
            this.lifePoints = 6;
            OffensiveGear attackStuff = new OffensiveGear("Katon", "Spell", 15);
            DefensiveGear defenseStuff = new DefensiveGear("Philtrum", "Philtre", 10);
        } else {
            System.out.println("Please chose between \"warrior\" and \"magician\"");
        }
    }

    //On établit les getter et setter de chacun de nos "Instance Fields"
    public String getCharacterType() {
        return characterType;
    }
    public void setCharacterType(String type) {
        this.characterType = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String characterName) {
        this.name = characterName;
    }

    // On définit une méthode toString() sinon lors du print de notre objet la console renverra ClassName.adressmemory
    @Override
    public String toString() {
        return "Character{" +
                "characterType='" + characterType + '\'' +
                ", name='" + name + '\'' +
                ", lifePoints=" + lifePoints +
                '}';
    }
}
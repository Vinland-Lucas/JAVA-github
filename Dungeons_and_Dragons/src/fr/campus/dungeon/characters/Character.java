package fr.campus.dungeon.characters;

import fr.campus.dungeon.equipements.OffensiveGear;
import fr.campus.dungeon.equipements.DefensiveGear;

public abstract class Character {
    // On crée les Instance Fields ou Instance Variables de notre class
   private String characterType;
   private String name;
   private int lifePoints;
   private int strength;
   private OffensiveGear offensiveGear;
   private DefensiveGear defensiveGear;

    // On crée le constructeur (on peut en avoir plusieurs dans une même class)
    public Character() {

    }

    public Character(String characterName) {
        this.name = characterName;
    }

    public Character(String type, String characterName) {
        this.characterType = type;
        this.name = characterName;

//        if (type.equals("Warrior")) {
//            this.lifePoints = 10;
//            //this.offensiveGear = new OffensiveGear("Senbonzakura", "Weapon", 10);
//            //this.defensiveGear = new DefensiveGear("Jadis", "Shield", 10);
//        } else if (type.equals("Magician")) {
//            this.lifePoints = 6;
//            //this.offensiveGear = new OffensiveGear("Katon", "Spell", 15);
//            //this.defensiveGear = new DefensiveGear("Philtrum", "Philtre", 10);
//        } else {
//            System.out.println("PLEASE CHOOSE BETWEEN \"Warrior\" and \"Magician\"");
//        }
    }

    public abstract void characterFeatures();

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

    public int getLifePoints() {
        return lifePoints;
    }
    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public OffensiveGear getOffensiveGear() {
        return offensiveGear;
    }
    public void setOffensiveGear(OffensiveGear offensiveGear) {
        this.offensiveGear = offensiveGear;
    }

    public DefensiveGear getDefensiveGear() {
        return defensiveGear;
    }
    public void setDefensiveGear(DefensiveGear defensiveGear) {
        this.defensiveGear = defensiveGear;
    }

    // On définit une méthode toString() sinon lors du print de notre objet la console renverra ClassName.adressmemory
    @Override
    public String toString() {
        return "Character{" +
                "characterType='" + characterType + '\'' +
                ", name='" + name + '\'' +
                ", lifePoints=" + lifePoints +
                ", strength=" + strength +
                ", offensiveGear=" + offensiveGear +
                ", defensiveGear=" + defensiveGear +
                '}';
    }
}

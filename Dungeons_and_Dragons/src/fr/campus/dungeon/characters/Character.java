package fr.campus.dungeon.characters;

public class Character {
   private String characterType;
   private String name;
   private int lifePoints;
   private int attackDamage;
   private String defaultOffensiveWeapon;
   private String defensiveWeapon;

    private Character(String type, String characterName, int life, int attack, String offensiveWeapon, String defenseWeapon) {
        this.characterType = type;
        this.name = characterName;
        this.lifePoints = life;
        this.attackDamage = attack;
        this.defaultOffensiveWeapon = offensiveWeapon;
        this.defensiveWeapon = defenseWeapon;

        if(type.equals("warrior")) {
            life = 10;
            attack = 10;
            offensiveWeapon = "weapon";
        } else if (type.equals("magician")) {
            life = 6;
            attack = 15;
            offensiveWeapon = "spell";
        } else {
            System.out.println("Please chose between \"warrior\" and \"magician\"");
        }
    }
}

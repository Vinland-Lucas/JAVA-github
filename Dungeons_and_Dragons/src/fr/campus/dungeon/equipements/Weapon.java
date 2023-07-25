package fr.campus.dungeon.equipements;

import java.util.Random;

public class Weapon extends OffensiveGear {
//    private int item;

    public Weapon(String weaponsName, String attackingEquipment, int damage) {
        super(weaponsName, attackingEquipment, damage);
    }

//    @Override
//    public void display() {
//        Random random = new Random();
//        this.item = random.nextInt(4) + 1;
//
//        switch (this.item) {
//            case 1:
//                new Weapon("Demon Dweller", "Weapon", 30);
//                break;
//            case 2:
//                new Weapon("Spirit of Zephyr", "Spell", 30);
//                break;
//            case 3:
//                new Weapon("Dragon Sword", "Weapon", 15);
//                break;
//            case 4:
//                new Weapon("Arrow of Judgment", "Spell", 15);
//        }
//    }
}

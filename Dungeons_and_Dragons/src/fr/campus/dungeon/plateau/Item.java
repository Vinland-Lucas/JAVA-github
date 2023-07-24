package fr.campus.dungeon.plateau;

import java.util.Random;

public class Item implements Case {
    public Item() {
        display();
    }

    public void createItem(String itemsName, String itemsType, int damage) {

    }

    public void display() {
        Random random = new Random();
        int item = random.nextInt(4) + 1;

        switch (item) {
            case 1:
                createItem("Demon Dweller", "Weapon", 30);
                break;
            case 2:
                createItem("Spirit of Zephyr", "Spell", 30);
                break;
            case 3:
                createItem("Dragon Sword", "Weapon", 15);
                break;
            case 4:
                createItem("Arrow of Judgment", "Spell", 15);
        }
    }

}

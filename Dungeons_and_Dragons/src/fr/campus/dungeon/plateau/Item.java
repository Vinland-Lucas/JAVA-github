package fr.campus.dungeon.plateau;

import java.util.Random;

public class Item implements Case {
    private int item;

    public Item() {
        display();
    }

    public void createItem(String itemsName, String itemsType, int damage) {

    }

    @Override
    public void display() {
        Random random = new Random();
        this.item = random.nextInt(4) + 1;

        switch (this.item) {
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

    //On établit les getter et setter de chacun de nos "Instance Fields"
    public int getItem() {
        return item;
    }
    public void setItem(int item) {
        this.item = item;
    }

    // On définit une méthode toString() sinon lors du print de notre objet la console renverra ClassName.adressmemory
    @Override
    public String toString() {
        return "Item{" +
                "item=" + item +
                '}';
    }
}

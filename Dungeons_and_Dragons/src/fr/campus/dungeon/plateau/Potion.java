package fr.campus.dungeon.plateau;


import java.util.Random;

public class Potion implements Case {
    public Potion() {
        display();
    }

    public void createPotion(String potionsName, String potionsType, int effects) {

    }

    public void display() {
        Random random = new Random();
        int potion = random.nextInt(3) + 1;

        if (potion == 1) {
            createPotion("Eniripsa", "Heal", 5);
        } else if (potion == 2) {
            createPotion("Elixir of Wrath", "Damage", 15);
        } else {
            createPotion("Elixir of Sorcery", "Damage", 15);
        }
    }


}

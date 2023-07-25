package fr.campus.dungeon.plateau;


import java.util.Random;

public class Potion implements Case {
    private int potion;

    public Potion() {
        display();
    }

    public void createPotion(String potionsName, String potionsType, int effects) {

    }

    @Override
    public void display() {
        Random random = new Random();
        this.potion = random.nextInt(3) + 1;

        if (this.potion == 1) {
            createPotion("Eniripsa", "Heal", 5);
        } else if (this.potion == 2) {
            createPotion("Elixir of Wrath", "Damage", 15);
        } else {
            createPotion("Elixir of Sorcery", "Damage", 15);
        }
    }

    //On établit les getter et setter de chacun de nos "Instance Fields"
    public int getPotion() {
        return potion;
    }
    public void setPotion(int potion) {
        this.potion = potion;
    }

    // On définit une méthode toString() sinon lors du print de notre objet la console renverra ClassName.adressmemory
    @Override
    public String toString() {
        return "Potion{" +
                "potion=" + potion +
                '}';
    }
}

package fr.campus.dungeon.plateau;

public class Dice implements Case {

    private int dice;

    public Dice() {

    }

    @Override
    public void display() {
        this.dice = 1;
    }

    public int rollDice() {
        // Random random = new Random();

         this.dice = 1; //random.nextInt(6) + 1;

        return dice;
    }

    //On établit les getter et setter de chacun de nos "Instance Fields"
    public int getDice() {
        return dice;
    }
    public void setDice(int dice) {
        this.dice = dice;
    }

    // On définit une méthode toString() sinon lors du print de notre objet la console renverra ClassName.adressmemory
    @Override
    public String toString() {
        return "Dice{" +
                "dice=" + dice +
                '}';
    }
}

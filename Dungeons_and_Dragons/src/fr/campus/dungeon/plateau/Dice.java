package fr.campus.dungeon.plateau;

public class Dice implements Case {

    public Dice() {

    }

    public void display() {
        int dice = 1;
    }

    public int rollDice() {
        // Random random = new Random();

        int dice = 1; //random.nextInt(6) + 1;

        return dice;
    }

    //On établit les getter et setter de chacun de nos "Instance Fields"

}

package fr.campus.dungeon.engine;

import java.util.Random;

public class Dice {

    public Dice() {

    }

    public int rollDice() {
        Random random = new Random();

        int dice = random.nextInt(6) + 1;

        return dice;
    }

    //On établit les getter et setter de chacun de nos "Instance Fields"

}

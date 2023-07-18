// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package fr.campus.dungeon;

import java.util.Scanner; // Import the Scanner Class to read user input (entrée clavier)
import fr.campus.dungeon.characters.Character;
import fr.campus.dungeon.engine.Board;
import fr.campus.dungeon.equipements.OffensiveGear;
import fr.campus.dungeon.equipements.DefensiveGear;
import fr.campus.dungeon.engine.Menu;
import fr.campus.dungeon.engine.Game;
import fr.campus.dungeon.engine.Dice;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game);

        Dice dice = new Dice();
        System.out.println(dice);

        Board board = new Board();
        System.out.println(board);

        game.menuInteraction();
    }

}
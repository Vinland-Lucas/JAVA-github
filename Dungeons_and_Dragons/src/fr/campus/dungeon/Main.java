// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package fr.campus.dungeon;

import java.util.Scanner; // Import the Scanner Class to read user input (entrée clavier)
import fr.campus.dungeon.characters.Character;
import fr.campus.dungeon.equipements.OffensiveGear;
import fr.campus.dungeon.equipements.DefensiveGear;
import fr.campus.dungeon.engine.Menu;
import fr.campus.dungeon.engine.Game;

public class Main {

    public static void main(String[] args) {
        // Character player = new Character("Warrior", "Lucas");
        // System.out.println(player);

        Menu menu = new Menu();
        System.out.println(menu);
    }

}
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package fr.campus.dungeon;

import fr.campus.dungeon.engine.Game;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game);
        game.menuInteraction();

//        Warrior warrior = new Warrior("Warrior", "Lucas");
//        System.out.println(warrior);
//        System.out.println(warrior.getCharacterType());
//
//        Magician magician = new Magician("Magician", "Yuno");
//        System.out.println(magician);

    }

}
package fr.campus.dungeon.engine;

import fr.campus.dungeon.characters.Character;
import fr.campus.dungeon.engine.Menu;

public class Game {
    private Menu menu;
    private Character character;

    public Game() {
        this.menu = new Menu();
    }

    public void menuInteraction() {

        while(true) {
            String chooseMenuOptions = menu.displayMenu();

            if (chooseMenuOptions.equals("1")) {
                this.character = menu.createCharacter();
            } else if (chooseMenuOptions.equals("2") && this.character != null) {
                menu.displayCharacter();
            } else if (chooseMenuOptions.equals("3") && this.character != null) {

            } else if (chooseMenuOptions.equals("4")) {

            }
            else {
                System.out.println("My guy... you have to create your character !");
            }
        }


      /*  if (menu.displayMenu() == "3" && menu.createCharacter() != null) {

        }*/

        //return ;
    }


}

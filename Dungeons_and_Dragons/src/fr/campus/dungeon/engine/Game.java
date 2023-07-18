package fr.campus.dungeon.engine;

import fr.campus.dungeon.characters.Character;

public class Game {
    private Menu menu;
    private Character character;
    private boolean isTrue = true;

    public Game() {
        this.menu = new Menu();
    }

    public void menuInteraction() {

        while(this.isTrue) {
            String chooseMenuOptions = menu.displayMenu();

            if (chooseMenuOptions.equals("1")) {
                this.character = menu.createCharacter();
            } else if (chooseMenuOptions.equals("2") && this.character != null) {
                menu.displayCharacter();
            } else if (chooseMenuOptions.equals("3") && this.character != null) {
                menu.editCharacter();
            } else if (chooseMenuOptions.equals("4") && this.character != null) {
                System.out.println("Let's get started !");
                menu.playGame();
                break;
            } else if (chooseMenuOptions.equals("5")) {
                this.isTrue = false;
            } else {
                System.out.println("My guy... you have to create your character !");
            }
        }

    }




}

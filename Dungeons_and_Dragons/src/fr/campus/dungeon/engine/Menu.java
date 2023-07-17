package fr.campus.dungeon.engine;

import java.util.Scanner; // Import the Scanner Class to read user input (entrée clavier)
import fr.campus.dungeon.characters.Character;

public class Menu {
    private String userChoice;
    private Character character;
    private String characterType;
    private String name;
    Scanner menu = new Scanner(System.in);

    public Menu() {

    }

    public String displayMenu() {
        System.out.println("\nWELCOME TO DUNGEONS & DRAGONS !\n");
        System.out.println("1. Create your character\n" + "2. Show all character info\n" + "3. Edit your character\n" +"4. End the game\n");
        this.userChoice = menu.nextLine();

        return this.userChoice;
    }

    public Character createCharacter() {
        System.out.println("Choose between \"Warrior\" and \"Magician\" : ");
        this.characterType = menu.nextLine();
        System.out.println("Type : " + characterType + "\n");

        System.out.println("Enter your name : ");
        this.name = menu.nextLine();
        System.out.println("Name : " + name + "\n");

        this.character = new Character(characterType, name);
        System.out.println("Here is your character's features :\n" + character);

        return this.character;
    }

    public Character displayCharacter() {
        this.character = new Character(characterType, name);
        System.out.println("Here is your character's features :\n" + character);

        return this.character;
    }

    public Character editCharacter() {
        System.out.println("Let's modify your character");
        this.characterType = menu.nextLine();
        System.out.println("Type : " + characterType + "\n");

        System.out.println("Enter your name : ");
        this.name = menu.nextLine();
        System.out.println("Name : " + name + "\n");

        this.character = new Character(characterType, name);
        System.out.println("Here is your character's features :\n" + character);

        return this.character;
    }
    
}

package fr.campus.dungeon.engine;

import java.util.Scanner; // Import the Scanner Class to read user input (entrée clavier)
import java.lang.System;
import fr.campus.dungeon.characters.Character;

public class Menu {
    private String userChoice;
    private Character character;
    private String characterType;
    private String name;
    private int playerPosition;
    private Board board;
    private Dice dice;
    Scanner menu = new Scanner(System.in);

    public Menu() {
        this.board = new Board();
        this.dice = new Dice();
    }

    public String displayMenu() {
        System.out.println("\nWELCOME TO DUNGEONS & DRAGONS !\n");
        System.out.println("1. Create your character\n" + "2. Show all character's infos\n" + "3. Edit your character\n"
                + "4. Start Game\n" + "5. End Game");
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

        //this.character = new Character(characterType, name);
        System.out.println("Here is your character's features :\n" + character);

        return this.character;
    }

    public Character displayCharacter() {
        //this.character = new Character(characterType, name);
        System.out.println("Here is your character's features :\n" + character);

        return this.character;
    }

    public Character editCharacter() {
        System.out.println("Let's modify your character !\n");

        //this.character = new Character(characterType, name);
        System.out.println("Here is your actual character's features :\n" + character + "\n");

        System.out.println("Change your \"TYPE\" ? [Yes or No]");
        this.userChoice = menu.nextLine();
        if (this.userChoice.equals("Yes")) {
            System.out.println("Choose between \"Warrior\" and \"Magician\" : ");
            this.character.setCharacterType(this.characterType = menu.nextLine());
            System.out.println("Type : " + characterType + "\n");
            //this.character = new Character(character.getCharacterType(), name);
            System.out.println("Here is your new character's features :\n" + character + "\n");
        } else {
            System.out.println("Let's start the game !\n");
        }

        System.out.println("Change your \"NAME\" ? [Yes or No]");
        this.userChoice = menu.nextLine();
        if (this.userChoice.equals("Yes") && this.characterType != null) {
            System.out.println("Enter your name : ");
            this.character.setName(this.name = menu.nextLine());
            System.out.println("Name : " + name + "\n");
            //this.character = new Character(character.getCharacterType(), character.getName());
            System.out.println("Here is your new character's features :\n" + character + "\n");
        } else {
            System.out.println("Let's start the game !\n");
        }

        return this.character;
    }

    public void playGame() {
        int boardLength = board.getBoardCells().length;
        this.playerPosition = 1;
        System.out.println("You are on the " + this.playerPosition + "st cell\n");


        while (this.playerPosition < boardLength) {
            int diceNumber = dice.rollDice();
            System.out.println("*Roll the dice*\n" + "Number : " + diceNumber + "\nYou advance " + diceNumber + " cells");

            this.playerPosition = this.playerPosition + diceNumber;
            System.out.println("You are now on the " + this.playerPosition + "th cell\n");

            if (this.playerPosition >= boardLength) {
                System.out.println("CONGRATULATION !!! YOU WON !!!\n Wanna play again ? [Yes or No]");
                this.userChoice = menu.nextLine();
                if (this.userChoice.equals("Yes")) {
                    playGame();
                } else {
                    break;
                }
            }
        }
    }


    //On établit les getter et setter de chacun de nos "Instance Fields"
    public String getUserChoice() {
        return userChoice;
    }
    public void setUserChoice(String uChoice) {
        this.userChoice = uChoice;
    }

    public Character getCharacter() {
        return this.character;
    }
    public void setCharacter(Character chara) {
        this.character = chara;
    }

    public String getCharacterType() {
        return characterType;
    }
    public void setCharacterType(String type) {
        this.characterType = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String characterName) {
        this.name = characterName;
    }
    
}

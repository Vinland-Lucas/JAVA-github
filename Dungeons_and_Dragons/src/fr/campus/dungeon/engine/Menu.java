package fr.campus.dungeon.engine;

import java.util.Scanner; // Import the Scanner Class to read user input (entrée clavier)
import java.lang.System;
import fr.campus.dungeon.characters.Character;
import fr.campus.dungeon.characters.Magician;
import fr.campus.dungeon.characters.Warrior;
import fr.campus.dungeon.plateau.Board;
import fr.campus.dungeon.plateau.Dice;

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

        displayCharacterFeatures();

        return this.character;
    }

    public Character displayCharacter() {
        System.out.println("Here is your character's features :\n" + character);

        return this.character;
    }

    public Character editCharacter() {
        System.out.println("Let's modify your character !\n");

        System.out.println("Here is your actual character's features :\n" + character + "\n");

        System.out.println("Change your \"TYPE\" ? [Yes or No]");
        this.userChoice = menu.nextLine();
        if (this.userChoice.equals("Yes")) {
            System.out.println("Choose between \"Warrior\" and \"Magician\" : ");
            this.character.setCharacterType(this.characterType = menu.nextLine());
            System.out.println("Type : " + this.characterType + "\n");
            // this.character = new Character(character.getCharacterType(), name);
           // System.out.println("Here is your new character's features :\n" + character + "\n");
            newCharacterFeatures();
        } else {
            System.out.println("Let's start the game !\n");
        }

        System.out.println("Change your \"NAME\" ? [Yes or No]");
        this.userChoice = menu.nextLine();
        if (this.userChoice.equals("Yes") && this.characterType != null) {
            System.out.println("Enter your name : ");
            this.character.setName(this.name = menu.nextLine());
            System.out.println("Name : " + this.name + "\n");
            //this.character = new Character(character.getCharacterType(), character.getName());
            System.out.println("Here is your new character's features :\n" + character + "\n");
        } else {
            System.out.println("Let's start the game !\n");
        }

        return this.character;
    }

    public void playGame() {
        int i = 0;
        int boardLength = this.board.getBoardCells().size();
        this.playerPosition = 0;
        System.out.println("The wind blows... You're standing in front of the dungeon entrance\nPrepare for battle ! ");


        while (this.playerPosition < boardLength) {
            int diceNumber = this.dice.rollDice();
            System.out.println("\n*Roll the dice*\n" + "Number : " + diceNumber + "\nYou advance " + diceNumber + " cells");

            this.playerPosition = this.playerPosition + diceNumber;
            System.out.println("You are now on the cell number : " + this.playerPosition);
            // for (int i = 0; i < boardLength; i += diceNumber) {
            // }

            if (this.playerPosition == 1) {
                System.out.println(this.board.getBoardCells().get(i));
            } else if (this.playerPosition == 2) {
                System.out.println(this.board.getBoardCells().get(i));
            } else if (this.playerPosition == 3) {
                System.out.println(this.board.getBoardCells().get(i));
            } else if (this.playerPosition == 4) {
                System.out.println(this.board.getBoardCells().get(i));
            } else {
                System.out.println("*** ERROR ***\nYOU'RE OUT OF BOUNDS");
            }

            if (this.playerPosition >= boardLength) {
                System.out.println("\nCONGRATULATION !!! YOU WON !!!\n Wanna play again ? [Yes or No]");
                this.userChoice = menu.nextLine();
                if (this.userChoice.equals("Yes")) {
                    playGame();
                } else {
                    break;
                }
            }

            i++;
        }
    }

    public void displayCharacterFeatures() {
        if (this.characterType.equals("Warrior")) {
            this.character = new Warrior(this.characterType, this.name);
        } else if (this.characterType.equals("Magician")) {
            this.character = new Magician(this.characterType, this.name);
        } else {
            System.out.println("*** ERROR ***\nPLEASE CHOOSE BETWEEN \"Warrior\" and \"Magician\"");
        }

        System.out.println("Here is your character's features :\n" + this.character);
    }

    public void newCharacterFeatures() {
        if (this.characterType.equals("Warrior")) {
            this.character = new Warrior(this.character.getCharacterType(), this.name);
        } else if (this.characterType.equals("Magician")) {
            this.character = new Magician(this.character.getCharacterType(), this.name);
        } else {
            System.out.println("*** ERROR ***\nPLEASE CHOOSE BETWEEN \"Warrior\" and \"Magician\"");
        }

        System.out.println("Here is your new character's features :\n" + character + "\n");
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

package fr.campus.dungeon.engine;

import java.util.Scanner; // Import the Scanner Class to read user input (entrée clavier)
import fr.campus.dungeon.characters.Character;

public class Menu {
    private int userChoice;
    private Character character;
    private String characterType;
    private String name;

    public Menu() {
        Scanner menu = new Scanner(System.in);
        System.out.println("Welcome to Dungeons & Dragons");
        System.out.println("1. Create your character");
        System.out.println("2. Show all character info");
        System.out.println("3. Edit your character");
        System.out.println("4. End the game");

        System.out.println("Choose one of these options");
        this.userChoice = menu.nextInt();
        System.out.println("The player choose the option : " + userChoice);

        if (userChoice == 1) {
            // Cette ligne permet de générer un saut de ligne (\n) car lorsque l'on fait un nextLine() précédé d'un
            // nextInt() et bien le nextInt() ne lira pas le saut de ligne. Il aurait fallut choisir l'option et le type
            // du perso en un seul input.
            // D'où le fait que ça sautait directement au "Enter your name" sans que j'ai écris le "type" de mon perso.
            menu.nextLine();

            System.out.println("Choose between \"Warrior\" and \"Magician\" : ");
            this.characterType = menu.nextLine();
            System.out.println(characterType);

            System.out.println("Enter your name : ");
            this.name = menu.nextLine();
            System.out.println(name);

            this.character = new Character(characterType, name);
            System.out.println(character);
        }

    }
    
}

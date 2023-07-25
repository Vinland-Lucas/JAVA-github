package fr.campus.dungeon.plateau;

public class EmptyCase implements Case {

    public EmptyCase() {
        display();
    }

    @Override
    public void display() {
        System.out.println("Empty Case");
    }

    // On définit une méthode toString() sinon lors du print de notre objet la console renverra ClassName.adressmemory
    @Override
    public String toString() {
        return "Empty Case";
    }
}

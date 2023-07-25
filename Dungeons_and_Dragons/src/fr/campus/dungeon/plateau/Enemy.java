package fr.campus.dungeon.plateau;

import java.util.Random;

public class Enemy implements Case {
    private int enemy;

    public Enemy() {
        display();
    }

    public void createEnemy(String enemysName, String enemysType, int enemysLife, int enemysDamage) {

    }

    @Override
    public void display() {
        Random random = new Random();
        this.enemy = random.nextInt(3) + 1;

        if (this.enemy == 1) {
            createEnemy("Shishi", "Gobelin", 6,3);
        } else if (this.enemy == 2) {
            createEnemy("Maho", "Wizard", 9,5);
        } else {
            createEnemy("Natsu", "Dragon", 15,10);
        }
    }

    //On établit les getter et setter de chacun de nos "Instance Fields"
    public int getEnemy() {
        return enemy;
    }
    public void setEnemy(int enemy) {
        this.enemy = enemy;
    }

    // On définit une méthode toString() sinon lors du print de notre objet la console renverra ClassName.adressmemory
    @Override
    public String toString() {
        return "Enemy{" +
                "enemy=" + enemy +
                '}';
    }
}

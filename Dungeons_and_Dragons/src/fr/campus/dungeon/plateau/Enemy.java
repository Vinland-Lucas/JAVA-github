package fr.campus.dungeon.plateau;

import java.util.Random;

public class Enemy implements Case {
    public Enemy() {
        display();
    }

    public void createEnemy(String enemysName, String enemysType, int enemysLife, int enemysDamage) {

    }

    public void display() {
        Random random = new Random();
        int enemy = random.nextInt(3) + 1;

        if (enemy == 1) {
            createEnemy("Shishi", "Gobelin", 6,3);
        } else if (enemy == 2) {
            createEnemy("Maho", "Wizard", 9,5);
        } else {
            createEnemy("Natsu", "Dragon", 15,10);
        }
    }
}

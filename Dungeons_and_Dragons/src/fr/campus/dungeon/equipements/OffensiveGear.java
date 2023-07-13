package fr.campus.dungeon.equipements;

public class OffensiveGear {
    // On crée les Instance Fields ou Instance Variables de notre class
    private String name;
    private String offensiveEquipment;
    private int attackDamage;

    // On crée le constructeur (on peut en avoir plusieurs dans une même class)
    public OffensiveGear(String offensiveEquipmentName, String attackingEquipment, int damage) {
        this.name = offensiveEquipmentName;
        this.offensiveEquipment = attackingEquipment;
        this.attackDamage = damage;
    }

    //On établit les getter et setter de chacun de nos "Instance Fields"
    public String getName() {
        return name;
    }
    public void setName(String offensiveEquipmentName) {
        this.name = offensiveEquipmentName;
    }

    public String getOffensiveEquipment() {
        return offensiveEquipment;
    }
    public void setOffensiveEquipment(String attackingEquipment) {
        this.offensiveEquipment = attackingEquipment;
    }

    public int getAttackDamage() {
        return attackDamage;
    }
    public void setAttackDamage(int damage) {
        this.attackDamage = damage;
    }

    // On définit une méthode toString() sinon lors du print de notre objet la console renverra ClassName.adressmemory
    @Override
    public String toString() {
        return "OffensiveGear{" +
                "name='" + name + '\'' +
                ", offensiveEquipment='" + offensiveEquipment + '\'' +
                ", attackDamage=" + attackDamage +
                '}';
    }
}

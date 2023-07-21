package fr.campus.dungeon.equipements;

public abstract class DefensiveGear {
    // On crée les Instance Fields ou Instance Variables de notre class
    private String name;
    private String defensiveEquipment;
    private int defenseLevel;

    // On crée le constructeur (on peut en avoir plusieurs dans une même class)
    public DefensiveGear(String defensiveEquipementName, String defenseEquipment, int levelOfDefense) {
        this.name = defensiveEquipementName;
        this.defensiveEquipment = defenseEquipment;
        this.defenseLevel = levelOfDefense;
    }

    //On établit les getter et setter de chacun de nos "Instance Fields"
    public String getName() {
        return name;
    }
    public void setName(String defensiveEquipmentName) {
        this.name = defensiveEquipmentName;
    }

    public String getDefensiveEquipment() {
        return defensiveEquipment;
    }
    public void setDefensiveEquipment(String defenseEquipment) {
        this.defensiveEquipment = defenseEquipment;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }
    public void setDefenseLevel(int levelOfDefense) {
        this.defenseLevel = levelOfDefense;
    }

    // On définit une méthode toString() sinon lors du print de notre objet la console renverra ClassName.adressmemory
    @Override
    public String toString() {
        return "DefensiveGear{" +
                "name='" + name + '\'' +
                ", defensiveEquipment='" + defensiveEquipment + '\'' +
                ", defenseLevel=" + defenseLevel +
                '}';
    }
}

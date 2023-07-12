package on_demenage;

public class Demenagement {
    static int totalCartons = 34;
    static int capaciteCamion = 9;
    static int nbVoyage;

    public static void main(String[] args) {
        while (totalCartons > 0) {
            nbVoyage++;
            if (totalCartons >= capaciteCamion) {
                totalCartons = totalCartons - capaciteCamion;
                System.out.println("Le voyage n°" + nbVoyage);
                System.out.println("Un voyage de " + capaciteCamion + " cartons");
            } else {
                totalCartons = totalCartons - totalCartons;
                System.out.println("Le voyage n°" + nbVoyage);
                System.out.println("Un voyage de " + totalCartons + " cartons");
            }
        }
    }

}

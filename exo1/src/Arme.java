public class Arme {

    private boolean isAllume;
    private int puissance;

    public Arme(int puissance) { this.puissance = puissance; }

    public void allume() {
        this.isAllume = true;
        System.out.println("L'arme est allumée.");
    }

    public int puissance() {
        return this.puissance;
    }

    public void eteindre() {
        this.isAllume = false;
        System.out.println("L'arme est éteinte.");
    }

    public boolean isAllume(){
        return this.isAllume;
    }

}

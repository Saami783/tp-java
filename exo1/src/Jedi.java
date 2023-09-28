public class Jedi extends Personnage {

    private Sabre SabreLaser;


    public Jedi(String nom, int vie, int x, int y, int force, Sabre sabreLaser)
    {
        super(nom, vie, x, y, 5, force);
        this.SabreLaser = sabreLaser;
    }

    public void parler() {
        System.out.println("Que la force soit avec vous !");
    }

    public void allumer() {
        if (this.SabreLaser.isAllume()){
            System.out.println("Le sabre laser est déjà allumé.");
        }else{
            this.SabreLaser.allume();
        }
    }

    public void eteindre() {
        if (!this.SabreLaser.isAllume()){
            System.out.println("Le sabre laser est déjà eteint.");
        }else{
            this.SabreLaser.eteindre();
        }
    }

    public void coupSabre(Personnage personnage) {

        if (this.SabreLaser.isAllume()) {
            personnage.seBlesse(this.SabreLaser, personnage);
        }

    }

}

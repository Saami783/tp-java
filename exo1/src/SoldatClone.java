public class SoldatClone extends Personnage {

    private Blaster blaster;

    public SoldatClone(String nom,  int x, int y, Blaster blaster) {
        super(nom, 100, x, y, 4, 2);
        this.blaster = blaster;
    }

    public void parler() {
        System.out.println("Je m'appelle " + super.getNom());

    }

    public void allumeBlaster() {
        if (this.blaster.isAllume()){
            System.out.println("Le blaster est déjà allumé.");
        }else{
            this.blaster.allume();
        }
    }

    public void eteindreBlaster() {
        if (!this.blaster.isAllume()){
            System.out.println("Le blaster est déjà eteint.");
        }else{
            this.blaster.eteindre();
        }
    }

    public void tireBlaster(Personnage personnage) {
        if (this.blaster.isAllume()){
            personnage.seBlesse(this.blaster, personnage);
        } else {
            System.out.println("Votre arme n'est pas allumée pour attaquer un personnage ! ");
        }
    }

}

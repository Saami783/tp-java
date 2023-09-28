public class Remunere extends Compte {

    private final double taux = 0.035;

    public Remunere(String titulaire, double solde) {
        super(titulaire, solde);
    }

    public void calculInteret() {
        System.out.println("Votre intérêt est de " +  super.getSolde() * this.taux + " euro.");
    }

}

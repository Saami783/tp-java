public abstract class Compte {
    private String titulaire;
    private int identifiant;
    private double solde;
    private static int compteur = 0;

    String nL1 = System.getProperty("line.separator");

    public Compte(String titulaire, double solde) {
        compteur++;
        this.titulaire = titulaire;
        this.solde = solde;
        this.identifiant = compteur;
    }

    public void crediter(double credit) {
        this.solde = this.solde + credit;
    }

    public void debiter(double debit) {
        this.solde -= debit;
    }


    public double getSolde() {
       return this.solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getIdentifiant() {
        return this.identifiant;
    }

    @Override
    public String toString() {
        return this.nL1 + "*************************" + this.nL1 +
                " compte n° : " + this.identifiant + this.nL1 +
                " titulaire     : " + this.titulaire + this.nL1 +
                " solde        : " + this.solde + " euro" + this.nL1 +
                "*************************" + this.nL1;
    }

    public void erreurDebit() {
        System.out.println("Le solde de votre compte est insuffisant pour être débité.");
    }

}

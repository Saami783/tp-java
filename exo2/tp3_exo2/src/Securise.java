public class Securise extends Compte {

    public Securise(String titulaire, double solde) {
        super(titulaire, solde);
    }

    @Override
    public void debiter(double debit) {

        if (super.getSolde() < debit) {
            super.erreurDebit();
        } else {
            super.debiter(debit);
        }

    }

}

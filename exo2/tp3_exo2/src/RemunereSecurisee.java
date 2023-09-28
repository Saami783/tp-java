public class RemunereSecurisee extends Remunere {
    public RemunereSecurisee(String titulaire, double solde) {
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

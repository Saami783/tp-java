public class Main {
    public static void main(String[] args) {

        Courant courant = new Courant("Sami", 2000);

        courant.crediter(100);
        courant.debiter(10);
        System.out.println(courant);

        Securise securise = new Securise("Sami - Securisé", 2000);

        securise.debiter(1000);
        securise.crediter(500);
        System.out.println(securise);
        securise.debiter(4000);

        Remunere remunere = new Remunere("Sami - Rémunéré", 6000);
        remunere.debiter(3000);
        remunere.crediter(1000);
        remunere.calculInteret();
        System.out.println(remunere);

        RemunereSecurisee remunereSecurisee = new RemunereSecurisee("Sami - Rémunéré Sécurisée", 10000);
        remunereSecurisee.debiter(15000);
        remunereSecurisee.crediter(15000);
        System.out.println(remunereSecurisee);

        Agence agence = new Agence("Agence de Sami");
        agence.setCompteCollectionToAgence(courant);
        agence.findCompteById(1);
        agence.findCompteById(2);

        System.out.println();
        System.out.println("Les des comptes de l'agence : ");

        System.out.println(agence);

        agence.deleteCompteById(1);

        System.out.println(agence);
    }
}
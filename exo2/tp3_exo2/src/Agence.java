import java.util.ArrayList;

public class Agence {
    private ArrayList<Compte> compteCollection;
    private String nom;

    public Agence(String nom) {
        this.nom =  nom;
        this.compteCollection = new ArrayList<>();
    }

    public void setCompteCollectionToAgence(Compte compte) {
        this.compteCollection.add(compte);
    }

    public void findCompteById(int identifiant) {

        for (Compte compte : compteCollection) {
            if (compte.getIdentifiant() == identifiant) {
                System.out.println("Extrait du compte n° " + identifiant + " :");
                System.out.print(compte);
                return;
            }
        }
        System.out.println("Aucun compte trouvé pour cet identifiant.");
    }

    public void deleteCompteById(int identifiant) {
        for (Compte compte : compteCollection) {
            if(compte.getIdentifiant() == identifiant) {
                compteCollection.remove(compte);
                System.out.println("Le compte n° " + identifiant + " a bien été supprimé.");
                return;
            }
        }
        System.out.println("Aucun compte trouvé pour cet identifiant.");
    }

    @Override
    public String toString() {

        if (compteCollection.isEmpty()){
            return "Aucun compte n'est enregistré pour cette agence.";
        }

        for (Compte compte : compteCollection) {
            System.out.println(compte);
        }

        return "";
    }
}

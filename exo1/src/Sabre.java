public class Sabre extends Arme {

    private String couleur;

    public Sabre(String couleur) {
        super(10);
        this.couleur = couleur;
    }

    public String getCouleur() { return couleur; }

    public void setCouleur(String couleur) { this.couleur = couleur;  }
}

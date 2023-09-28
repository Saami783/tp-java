public class Personnage {
    private String nom;
    private int vie;
    private int x;
    private int y;
    private int vitesse;
    private int force;

    public Personnage(String nom, int vie, int x, int y, int vitesse, int force) {
        this.nom = nom;
        this.vie = vie;
        this.x = x;
        this.y = y;
        this.vitesse = vitesse;
        this.force = force;
    }

    @Override
    public String toString() {
        return " Nom : " + this.nom +
                " HP du personnage : " + this.vie +
                " Force du personnage : " + this.force +
                " Vitesse du personnage : " + this.vitesse +
                " Coordonnées du personnage x : " + this.y + " y : " + this.x;
    }

    /** @TODO */
    public void seDeplace(int dx, int dt, int dy) { }

    public void seBlesse(Arme a, Personnage p) {
        // force du personnage * puissance - montant de la vie
       this.vie = this.force * a.puissance() - this.vie;
       System.out.println(p);
    }

    public String getNom() { return nom; }

}

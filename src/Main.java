import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        GestionFichier file = new GestionFichier();

        try {
            file.Lire();
        } catch (IOException e) {
            System.out.println("IO Exception.");
        } catch (LigneInterditeException ligneInterditeException) {
            System.out.println("Ligne interdite exception.");
        } catch (LigneManquanteException ligneManquanteException) {
            System.out.println("Ligne manquante exception.");
        }

    }
}
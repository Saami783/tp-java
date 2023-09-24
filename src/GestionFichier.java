import javax.annotation.processing.FilerException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class GestionFichier {

    private BufferedReader nomFichier;
    private int ligneInterdite;

    private Scanner entree;

    public GestionFichier() throws FileNotFoundException {

        this.entree = new Scanner(System.in);

        boolean fichierValide = false;

        while (!fichierValide) {

            System.out.println("Saisir un nom de fichier : ");
            String nomFichier = entree.nextLine();

            if (Objects.equals(nomFichier, "STOP")) System.exit(0);

            try {
                this.nomFichier = new BufferedReader(new FileReader(nomFichier + ".txt"));

                fichierValide =  true;

            } catch (FileNotFoundException e) { System.out.println(e.getMessage()); }

        }

        Random random = new Random();

        this.ligneInterdite = random.nextInt(1, 11);

    }

    public void Lire() throws IOException, LigneInterditeException, LigneManquanteException {
        System.out.println("Ligne interdite du fichier : " + this.ligneInterdite);

        System.out.println("Veuillez la ligne du fichier que vous souhaitez lire : ");

        int lineToRead = this.entree.nextInt();

        String line;
        int count = 1;

        boolean ligneTrouvee = false;

        while ((line = this.nomFichier.readLine()) != null) {
            if (lineToRead == count) {
                ligneTrouvee = true;

                if (lineToRead == ligneInterdite) {
                    throw new LigneInterditeException(this.ligneInterdite);
                } else {
                    System.out.println(line);
                    break;
                }
            }

            count++;
        }

        if (!ligneTrouvee) {
            throw new LigneManquanteException(lineToRead);
        }

        this.nomFichier.close();
    }


}

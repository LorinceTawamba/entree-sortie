package tech.satic.demo.appli;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;

public class Application {
    public static void main(String[] args) {
        System.out.println("====== DEBUT DU PROGRAMME =======");
        String name = System.getProperty("user.home");
        System.out.println(name);

        Properties prop = System.getProperties();
        Enumeration enumeration = prop.propertyNames();
        String propName = null;
        while (enumeration.hasMoreElements()) {
            propName = enumeration.nextElement().toString();
            System.out.println(propName);
        }

        String separator = System.getProperty("file.separator");
        System.out.println(separator);

        File homedir = new File(System.getProperty("user.home"));
        System.out.println(homedir);

        String folderPath = homedir + separator + "3IL3";
        System.out.println(folderPath);
        File newFolder = new File(folderPath);
        if (newFolder.mkdir()) {
            System.out.println("====== Répertoire crée avec succès ======");
        }
        else {
            System.out.println("====== Echec de création de répertoire ======");
        }

        String subFolderPath = folderPath + separator + "Projet" + separator + "Config";
        newFolder = new File(subFolderPath);
        if (newFolder.mkdirs()) {
            System.out.println("====== Répertoires crée avec succès ======");
        }
        else {
            System.out.println("====== Echec de création de répertoires ======");
        }

        File newFile = new File(System.getProperty("user.home"), "MonNOuveauFichier.txt");
        try {
            if (newFile.createNewFile()) {
                System.out.println("====== Fichier crée avec succès ======");
            }
        }
        catch (IOException exc) {
            exc.printStackTrace();
        }

        System.out.println("===== AVANT =====");
        // Afficher les permissions associées au fichier
        System.out.println("Exécutable: " + newFile.canExecute());
        System.out.println("Lecture: " + newFile.canRead());
        System.out.println("Ecriture: "+ newFile.canWrite());

        System.out.println("===== APRES =====");
        // Changer les permissions
        newFile.setExecutable(false);
        newFile.setReadable(false);
        newFile.setWritable(false);

        // Afficher les permissions associées au fichier
        System.out.println("Exécutable: " + newFile.canExecute());
        System.out.println("Lecture: " + newFile.canRead());
        System.out.println("Ecriture: "+ newFile.canWrite());



   /*     boolean peuExecuter = newFile.canExecute();
        //boolean peuLire     = newFile.canRead();
        //boolean peuEcrire   = newFile.canWrite();
        System.out.println("Peu exécuter ? : " + peuExecuter);
        //System.out.println("Peu lire ? : " + peuLire);
        //System.out.println("Peu ecrire ? : " + peuEcrire);

        System.out.println("===== APRES =====");
        boolean resultat = false;
        resultat = newFile.setExecutable(false);
        //resultat = newFile.setReadOnly();
        //resultat = newFile.setReadable(false);
        //resultat = newFile.setWritable(false);

        peuExecuter = newFile.canExecute();
        //peuLire     = newFile.canRead();
        //peuEcrire   = newFile.canWrite();
        System.out.println("Peu exécuter ? : " + peuExecuter);
        //System.out.println("Peu lire ? : " + peuLire);
        //System.out.println("Peu ecrire ? : " + peuEcrire);

    */
    }
}

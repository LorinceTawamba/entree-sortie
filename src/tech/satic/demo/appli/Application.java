package tech.satic.demo.appli;

import java.io.File;
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

    }
}

package pl.testuj.files_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Zadanie domowe: napisać metodę writeToFileWithoutTry, która robi to samo co writeToFile
tylko bez bloku try...catch
 */
public class SimpleFileOperationExamples {
    public static void main(String[] args) {
        // System.getProperty() - pobierze scieżkę do projektu
        //String pathToFile = System.getProperty("user.dir") + "\\names_base.txt"; // wersja dla Windows
        String pathToFile = System.getProperty("user.dir") + "/names_base.txt"; // wersja dla macOS (macbook)

        writeToFile(pathToFile, "Zenek");
        writeToFile(pathToFile, "Julia");

        readFromFile(pathToFile);
    }

    public static void writeToFile(String filePath, String textToSave) {
        // obiekt do zapisu danych do pliku
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath, true);
            fileWriter.write(textToSave + "\n");
        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku");
            e.printStackTrace();
        } finally {
            // powtórzenie try...catch ponieważ ciągle działamy na połączeniu do pliku
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readFromFile(String filePath) {
        File file = new File(filePath);
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            // Należy upewnić się czy istnieje kolejna linia
            // przed próbą jej popbrania - jeśli pobierzemy linię, która nie istnieje
            // to będzie rzucony wyjątek
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); // pobranie zawartości linii
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}



















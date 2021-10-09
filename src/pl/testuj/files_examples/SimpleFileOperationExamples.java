package pl.testuj.files_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.io.IOException.*;

/*
Zadanie domowe: napisać metodę writeToFileWithoutTry, która robi to samo co writeToFile
tylko bez bloku try...catch
 */
public class SimpleFileOperationExamples {
    public static void main(String[] args) throws IOException {

        String pathToFile = System.getProperty("user.dir") + "\\homework.txt";

        writeToFileWithoutTry(pathToFile, null);

    }


    public static void writeToFileWithoutTry(String filePath, String textToSave) throws IOException {
        FileWriter fileWriter = null;
        if (textToSave != null){
            fileWriter = new FileWriter(filePath, true);
            fileWriter.write("zapisany tekst to: " + "\n" + textToSave + "\n");
        } else {
            throw new IOException("Błędny tekst: " + textToSave);
        }
                fileWriter.close();
            }
}




















package ca.nl.cna.java2.streams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

/**
 * A starting example for character input and output
 *
 * A simple class to demonstrate using a file reader and file writer
 *  - Use a file
 *  - Demonstrate how native / unusable FileReader / FileWriter are
 *
 * @author Josh
 */
public class FunWithFileReader {

    public static void main(String[] args) {
        System.out.println("Fun with File Reader and Writer!");
        String fileName = "FunWithFileReader.txt";

        File file = new File(fileName);     //Find or create the file
        writeMessageToFile(file, "Have a nice day!!!");

        readFile(file);

    }

    /**
     * Simple method to setup the file
     * @param file
     */
    public static void writeMessageToFile(File file, String message){
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Test writing to text file \n\n" + message + "\n\n");
            fileWriter.write("Last executed on: " + LocalDate.now().toString());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File related IO exception!");
            e.printStackTrace();
        }
    }

    /**
     * Read in a character file using a FileReader
     * @param file
     */
    public static void readFile(File file){
        try{
            FileReader fileReader = new FileReader(file);

            //NOTE: This isn't a very useful or readable way to work with a file
            int c;
            while( (c = fileReader.read()) != -1){
                System.out.print(Character.toChars(c));
            }
            fileReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }



}

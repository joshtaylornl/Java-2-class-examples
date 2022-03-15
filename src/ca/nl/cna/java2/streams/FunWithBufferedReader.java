package ca.nl.cna.java2.streams;

import java.io.*;
import java.util.Scanner;

/**
 * A class to demonstrate the use of a buffered File Reader
 *
 * @author Josh
 */
public class FunWithBufferedReader {

    public static void main(String[] args) {
        System.out.println("Fun with Buffer Readers!");
        Scanner input = new Scanner(System.in);

        File inputFile = null;
        String fileName;

        System.out.printf("Enter file name to load: ");
        fileName = input.next();
        inputFile = new File(fileName);

        if (inputFile.exists()) {
            System.out.printf("\n%s exists!", fileName);
            System.out.printf("\nPath: %s", inputFile.getAbsolutePath());
            System.out.printf("\nLength: %d", inputFile.length());
        } else {
            System.out.printf("\n%s does not exist!", fileName);
        }

        try {
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println("*** File Dump *** \n\n");
            String line;
            while( (line = bufferedReader.readLine()) != null){
                //TODO Check to see if email is value uses String.Match or Patter/Matcher class
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.err.printf("File not found!");
        } catch (IOException e){
            System.err.printf("Error reading from Buffer!");
        }

    }

}

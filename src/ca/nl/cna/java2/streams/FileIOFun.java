package ca.nl.cna.java2.streams;

import java.io.*;
import java.util.Scanner;

/**
 * An application to play around with File IO from java.io package
 *
 * @author Josh
 */
public class FileIOFun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //File to work with
        System.out.println("Enter a file name:");
        String fileName = scanner.nextLine();

        //Point the System.err out to a txtfile
        try {
            System.setErr(
                    new PrintStream(new File("error.txt"))
            );
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

        //File object
        File file = new File(fileName);

        try {

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Blahahahahaha");
            bufferedWriter.flush();

        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

        System.err.println("Testing error printing");

        //Dump out file information at the end
        if(file.exists()){
            System.out.println("File Exists!");
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("File Length: " + file.length());
        } else {
            System.out.println("No file :(");
        }


    }

}

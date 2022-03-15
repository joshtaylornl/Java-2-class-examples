package ca.nl.cna.java2.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;

/**
 * Playing around with System streams System.out and System.err
 *
 * @author Josh
 */
public class FunWithSystemStreams {

    public static void main(String[] args) {
        System.out.println("Fun with System Streams!");

        String sysOutFileName = "SystemOut.txt";
        String sysErrFileName = "SystemErr.txt";

        File sysOutFile = new File(sysOutFileName);
        File sysErrFile = new File(sysErrFileName);

        try {
            System.setOut(new PrintStream(sysOutFile));
            System.setErr(new PrintStream(sysErrFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("I am printing to a file now!");
        System.out.println("Last executed on: " + LocalDate.now().toString());

        System.err.println("This is an error log!");
        System.err.println("Last executed on: " + LocalDate.now().toString());

    }

}

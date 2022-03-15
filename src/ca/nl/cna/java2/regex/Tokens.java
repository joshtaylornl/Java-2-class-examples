package ca.nl.cna.java2.regex;

import java.util.Scanner;

/**
 * Fun with Tokenizing
 *
 *
 */
public class Tokens {

    public static void main(String[] args) {
        // get sentence
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press Enter");
        String sentence = scanner.nextLine();

        // process user sentence
        String[] tokens = sentence.split(" ");
        System.out.printf("Number of elements: %d%nThe tokens are:%n", tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
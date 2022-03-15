package ca.nl.cna.java2.regex;

/**
 * Fun with Tokens class example
 */
public class FunWithTokenizing {

    public static void main(String[] args) {
        System.out.println("Fun with Tokens!");

        String panagram = "The quick brown fox jumps over the lazy dog";

        String[] tokens = panagram.split(" ");

        System.out.println(panagram);
        System.out.println("Number of tokens: " + String.valueOf(tokens.length));
        System.out.println("All tokens: \n");

        for (String s: tokens) {
            System.out.println("> " + s);
        }

    }

}

package ca.nl.cna.java2.regex;

/**
 * Fun with characters
 */
public class FunWithChars {

    public static void main(String[] args) {
        System.out.println("Fun with Characters!");
        char c = '&';

        System.out.printf("Char value: %c", c);

        if(Character.isWhitespace(c)){
            System.out.println("\nIt's white space");
        } else {
            System.out.println("\nIt's not white space");
        }
    }

}

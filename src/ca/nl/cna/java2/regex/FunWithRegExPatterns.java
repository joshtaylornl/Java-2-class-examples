package ca.nl.cna.java2.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Example class to demonstrate patterns and matching
 *
 * @author Josh
 */
public class FunWithRegExPatterns {

    // Email regular expression description pulled from regexr.com
    // Check it out here: https://regexr.com/3e48o
    public static final String EMAIL_ADDRESS_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

    public static void main(String[] args) {
        System.out.println("Fun with patterns!");
        Pattern emailPattern = Pattern.compile(EMAIL_ADDRESS_REGEX);

        Scanner input = new Scanner(System.in);
        char c; //Char to drive menu choice

        do{
            printMenu();
            String expression = input.nextLine();
            System.out.printf("\nEcho: %s", expression);

            Matcher matcher = emailPattern.matcher(expression);

            //TODO learn how find works Josh! #CNAsFinest

            if (matcher.find()){
                System.out.println("Valid email address!");
            } else if(matcher.matches()){
                System.out.println("Contains email address!");
            } else {
                System.out.println("Give it up today Josh you suck");
            }

            c = Character.toUpperCase(expression.charAt(0));
        }while(c!='Q');

        System.out.println("\nGOODBYE!");
    }

    public static void printMenu(){
        System.out.println("\n\nGive me an expression:");
        System.out.println("(Q) Quit");
    }

}

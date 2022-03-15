package ca.nl.cna.java2.streams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Test some regular expressions
 *
 */
public class FunWithRegex {

    public static void main(String[] args) {
        System.out.println("Fun with Regular Expressions");
        Scanner scanner = new Scanner(System.in);

        String regex = "^(.+)@(.+)$";
        String email = "";

        do{

            System.out.println("Enter an email:");
            email = scanner.nextLine();

            if(isValidEmail(email)){
                System.out.println("ok Email: " + email);
            } else {
                System.out.println("INVALID Email: " + email);
            }


        } while (isValidEmail(email));


    }

    public static boolean isValidEmail(String email){
        String regex = "^(.+)@(.+)$";
        return email.matches(regex);
    }


}

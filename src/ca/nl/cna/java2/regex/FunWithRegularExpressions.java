package ca.nl.cna.java2.regex;

import java.util.Scanner;

/**
 * Regular expression examples
 */
public class FunWithRegularExpressions {

    public static void main(String[] args) {
        System.out.println("Fun with Regular Expressions!");

        Scanner input = new Scanner(System.in);

        System.out.print("First Name> ");
        String firstName = input.nextLine();

        if(firstName.matches("[A-Z][a-zA-Z]{3,}")){
            System.out.println("Congrats you first name is valid according to me!");
        } else {
            System.out.println("Here now!?");
        }


        System.out.print("Email> ");
        String email = input.next();

        // Email regular expression description pulled from regexr.com
        // Check it out here: https://regexr.com/3e48o
        if(!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")){
            System.out.println("Invalid Email!");
        }

        System.out.println(firstName + ", " + email);

    }

}

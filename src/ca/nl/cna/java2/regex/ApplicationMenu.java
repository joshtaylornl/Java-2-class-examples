package ca.nl.cna.java2.regex;

import java.util.Scanner;

/**
 * Simple console Menu Application to use
 *
 * @author Josh
 */
public class ApplicationMenu {

    public static void main(String[] args) {
        System.out.println("Doing something fun on a Console!");

        Scanner input = new Scanner(System.in);
        char c; //Char to drive menu choice

        do{
            printMenu();
            //Grab the user input
            c = Character.toUpperCase(input.next().charAt(0));

            System.out.printf("\nEcho: %c", c);

            if(c=='A'){
                System.out.printf("\nIn Option %c", c);
                //TODO do something
            } else  if(c=='B'){
                System.out.printf("\nIn Option %c", c);
                //TODO do something
            } else if (c=='C'){
                System.out.printf("\nIn Option %c", c);
                //TODO do something
            }

        }while(c!='Q');

        System.out.println("\nGOODBYE!");
    }

    public static void printMenu(){
        System.out.println("\n\nMake a choice");
        System.out.println("(A) Option A");
        System.out.println("(B) Option B");
        System.out.println("(C) Option C");
        System.out.println("(Q) Quit");
    }

}

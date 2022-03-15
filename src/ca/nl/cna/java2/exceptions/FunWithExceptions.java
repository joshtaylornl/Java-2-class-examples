package ca.nl.cna.java2.exceptions;

import java.io.IOException;
import java.util.Random;

/**
 * Class to demonstrate some of the more fun exception stuff
 * - Demonstrate order of exception handling
 * - Demonstrate catch or declare
 *
 * @author Josh
 */
public class FunWithExceptions {

    public static void main(String[] args) {
        System.out.println("Fun with Exceptions!");

        try{
            doSomething();
            doSomethingElse();
            System.out.println("No Exception occurred!");

        } catch(CustomException customException){
            System.err.println(customException.getMessage());
        } catch(IOException ioException){
            System.err.println("in IOException Block");
        } finally {
            System.err.println("In the finally block - not even needed");
        }
    }

    /**
     * Useless method that throws a Custom Exception 1/2 the time
     * @throws CustomException
     */
    public static void doSomething() throws CustomException {
        System.out.println("In do something method");
        Random random = new Random();

        //An exception will occur 50% of the time
        if(random.nextInt() % 2 == 0){
            throw new CustomException();
        }
    }

    /**
     * Useless method that throws a Custom Exception 1/2 the time
     * @throws IOException
     */
    public static void doSomethingElse() throws IOException {
        System.out.println("In do something else method");
        Random random = new Random();

        //An exception will occur 50% of the time
        if(random.nextInt() % 2 == 0){
            throw new IOException();
        }
    }

}

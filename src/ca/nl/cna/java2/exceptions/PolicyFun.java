package ca.nl.cna.java2.exceptions;

/**
 * A simple example to show loading up a poorly formed insurance policy
 * and how it can be handled by an exception
 *
 * @author Josh
 */
public class PolicyFun {

    public static void main(String[] args) {

        //Silly example to demonstrate
        try {
            loadPolicy();
        } catch (PolicyNotWellFormedException policyNotWellFormedException) {
            policyNotWellFormedException.printStackTrace();
        }

    }

    /**
     * Simple method that always throws an exception
     * @throws PolicyNotWellFormedException
     */
    public static void loadPolicy() throws PolicyNotWellFormedException{
        throw new PolicyNotWellFormedException();
    }


}

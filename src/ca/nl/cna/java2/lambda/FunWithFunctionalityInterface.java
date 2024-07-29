package ca.nl.cna.java2.lambda;

/**
 * Simple tester class that shows interface definition old approach vs lambda
 *
 * @author Josh
 */
public class FunWithFunctionalityInterface {

    public static void main(String[] args) {
        System.out.println("In Fun With Functionality Interface...");

        //Old skool approach using an Anonymous Class
        Functionality oldSkool = new Functionality() {
            @Override
            public void doSomething() {
                System.out.println("Old Skool!");
            }
        };
        oldSkool.doSomething();

        //Lambda approach
        Functionality newSkool = () -> System.out.println("New Skool!");
        newSkool.doSomething();

    }

    public static void printFoo(Foo foo){
        System.out.printf("\nFoo desc: %s", foo.getDescription());
    }

}

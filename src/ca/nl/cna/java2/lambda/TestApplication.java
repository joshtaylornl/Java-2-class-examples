package ca.nl.cna.java2.lambda;

/**
 * Simple tester class
 */
public class TestApplication {

    public static void main(String[] args) {
        System.out.println("Test main...");

        //Old skool
        Functionality oldSkool = new Functionality() {
            @Override
            public void doSomething() {
                System.out.println("Old Skool!");
            }
        };
        oldSkool.doSomething();

        Functionality newSkool = () -> System.out.println("New Skool!");
        newSkool.doSomething();

    }

    public static void printFoo(Foo foo){
        System.out.printf("\nFoo desc: %s", foo.getDescription());
    }

}

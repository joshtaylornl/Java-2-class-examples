package ca.nl.cna.java2.lambda.structured;

public class FunctionalInterfaceImpl {
    public static void main(String[] args) {

        //The old ways to do things
        Thread myRunnableThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running thread with Runnable");
            }
        });
        myRunnableThread.start();

        //The new ways!
        Thread myLambdaThread = new Thread(() -> System.out.println("Running thread with Lambda"));
        myLambdaThread.start();
    }

}

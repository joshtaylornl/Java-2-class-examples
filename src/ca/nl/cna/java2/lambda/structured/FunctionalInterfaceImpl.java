package ca.nl.cna.java2.lambda.structured;

public class FunctionalInterfaceImpl {
    public static void main(String[] args) {

       /* Thread myRunnableThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running thread with Runnable");
            }
        });*/

        Thread myLambdaThread = new Thread(() -> System.out.println("Running thread with Lambda"));

        myLambdaThread.run();
       // myRunnableThread.run();
    }

}

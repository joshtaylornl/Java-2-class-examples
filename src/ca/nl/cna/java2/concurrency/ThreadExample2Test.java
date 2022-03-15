package ca.nl.cna.java2.concurrency;

/**
 * Thread Example 2 Main
 *
 * @author Albert Norman
 */
public class ThreadExample2Test {
    public static void main(String[] args) {

        ThreadExample2 thread1 = new ThreadExample2("thread1");
        thread1.start();
        ThreadExample2 thread2 = new ThreadExample2("thread2");
        thread2.start();
    }
}


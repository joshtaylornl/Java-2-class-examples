package ca.nl.cna.java2.concurrency;

/**
 * Thread Example 2 from the Java 2 notes
 *
 * @author Albert Norman
 */
public class ThreadExample2 implements Runnable {
    Thread thread1;
    private String tname;

    ThreadExample2(String name) {
        tname = name;
    }
    @Override
    public void run() {
        System.out.println("Thread running: " + tname);
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            System.out.println(tname);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
    }

    public void start() {
        System.out.println("Thread started");
        if (thread1 == null) {
            thread1 = new Thread(this,tname);
            thread1.start();
        }
    }
}





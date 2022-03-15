package ca.nl.cna.java2.concurrency;

/**
 * Thread Example 1 from Java 2 Notes
 *
 * @author Albert Norman
 */
public class ThreadExample1 implements Runnable {
    @Override
    public void run() {
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread();
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();

        thread1.setPriority(Thread.MAX_PRIORITY);
        System.out.printf("\nIs thread alive? %b\n", thread1.isAlive());

        System.out.printf("\nMin priority: %d, Max Priority: %d\n", Thread.MIN_PRIORITY, Thread.MAX_PRIORITY);

        int priority = thread1.getPriority();
        System.out.println("Thread Priority: " + priority);
        System.out.println("Thread Running");

        thread1.setPriority(1);
        System.out.println("Thread Priority: " + thread1.getPriority());
        System.out.printf("\nIs thread alive? %b\n", thread1.isAlive());

        try {
            thread1.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.printf("\nIs thread alive? %b", thread1.isAlive());

    }
}

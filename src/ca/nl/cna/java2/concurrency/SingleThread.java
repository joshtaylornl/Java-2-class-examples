package ca.nl.cna.java2.concurrency;

/**
 * Concurrency.SingleThread example from Java 2 Notes
 *
 * @author Albert Norman
 */
public class SingleThread {
    public static void main(String[] args){
        Thread thread = Thread.currentThread();

        //Get the currently running thread object
        thread.setName("Single thread"); //Thread renaming
        System.out.println(thread.getName()+"Running");

        for(int i=0;i<10;i++){
            System.out.println("Threads are dormant:"+i);
            try {
                thread.sleep(2000);
                //Thread dormancy, delayed by one second
            } catch (InterruptedException e) {

                e.printStackTrace();
                System.out.println("Thread error");
            }
        }
    }
}

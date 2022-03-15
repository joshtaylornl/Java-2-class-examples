package ca.nl.cna.java2.concurrency;

/**
 * Extend the thread class.
 */
public class SpecialThread extends Thread {

    @Override
    public void run() {
        super.run();
        Thread thread = Thread.currentThread();
        //Get the currently running thread object
        System.out.println(thread.getName()+"Running");

        for(int i=0;i<4;i++){
            System.out.println( "Thread - " + thread. getName() + " -  is dormant:"+i);
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

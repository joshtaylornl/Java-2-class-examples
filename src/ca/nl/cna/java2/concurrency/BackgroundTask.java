package ca.nl.cna.java2.concurrency;

/**
 * Class with stuff meant to run in a thread.
 *
 * Trying to save face here.
 *
 * @author Josh
 */
public class BackgroundTask implements Runnable{

    private int dormancyPeriodms;

    public BackgroundTask(int dormancyPeriodms) {
        this.dormancyPeriodms = dormancyPeriodms;
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        //Get the currently running thread object
        System.out.println(thread.getName()+"Running");

        for(int i=0;i<4;i++){
            System.out.println( "Thread - " + thread. getName() + " -  is dormant:"+i);
            try {
                thread.sleep(this.dormancyPeriodms);
                //Thread dormancy, delayed by one second
            } catch (InterruptedException e) {

                e.printStackTrace();
                System.out.println("Thread error");
            }
        }
    }

    public int getDormancyPeriodms() {
        return dormancyPeriodms;
    }

    public void setDormancyPeriodms(int dormancyPeriodms) {
        this.dormancyPeriodms = dormancyPeriodms;
    }
}

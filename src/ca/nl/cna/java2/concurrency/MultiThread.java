package ca.nl.cna.java2.concurrency;

/**
 * Concurrency.MultiThread Example from Java 2 Notes.
 *
 * Added runnable Foo class with simple timed loop.
 *
 * @Author Albert Norman
 */
public class MultiThread{

    public static void main(String[] args) {
        Thread myThread1 = new Thread(new BackgroundTask(1000),"MyTestThread1");
        Thread myThread2 = new Thread(new SpecialThread(),"MySpecialThread");

        myThread1.start();
        myThread2.start();

        doLoopsAndStuff();

        System.out.printf("\nIs " + myThread1.getName() + " alive? %b\n", myThread1.isAlive());
        System.out.printf("\nIs " + myThread2.getName() + " alive? %b\n", myThread2.isAlive());
        System.out.printf("\nIs " + Thread.currentThread().getName() + " alive? %b\n", Thread.currentThread().isAlive());


    }

    public static void doLoopsAndStuff(){
        Thread thread = Thread.currentThread();
        //Get the currently running thread object
        System.out.println(thread.getName()+"Running");

        for(int i=0;i<6;i++){
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

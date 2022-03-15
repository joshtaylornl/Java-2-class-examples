package ca.nl.cna.java2.concurrency;

/**
 * Concurrency.Unsynchronized example from Java 2 notes
 *
 * @author Albert Norman
 */
public class Unsynchronized implements Runnable
{
    int tickets = 3;
    static int i = 1, j = 2, k = 3;

    public void bookTicket(String name, int wantedTickets){
        if (wantedTickets <= tickets) {
            System.out.println (wantedTickets + " booked to " + name);
            tickets = tickets - wantedTickets;
        } else {
            System.out.println ("No tickets to book");
        }

        System.out.println("Tickets: "+ tickets);
    }

    public void run (){
        String name = Thread.currentThread().getName();
        if (name.equals ("t1")) {
            bookTicket(name, i);
        } else if (name.equals ("t2")) {
            bookTicket(name, j);
        } else {
            bookTicket(name, k);
        }
    }

    public static void main (String[]args)
    {
        Unsynchronized s = new Unsynchronized();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
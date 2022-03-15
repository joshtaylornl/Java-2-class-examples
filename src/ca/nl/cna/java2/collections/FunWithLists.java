package ca.nl.cna.java2.collections;

import java.io.PrintStream;
import java.util.*;

/**
 * Playing around with List objects. Showing the differences in implementation and how to iterate
 *
 * @author Josh
 */
public class FunWithLists {

    public static void main(String[] args) {
        System.out.println("Fun with Lists!");

    /*
        Let's say I want to create a list of integers. I could do the following:
        a) List<Integer> list = new ArrayList<>();          //Declare a list using an ArrayList assuming I won't be modifying the list a lot
        b) List<Integer> list = new LinkedList<>();         //Declare it as a LinkedList because it will modify a lot
        c) List<Integer> list = new Vector<>();             //Declare it as a Vector cause it is being used in a thread
        d) LinkedList<Integer> list = new LinkedList<>();   //Declare it as a LinkedList because I want the LinkedList functionality

        What you don't see is this:
        e) ArrayList<Integer> list = new ArrayList<>();     //Because no one cares if your List is an Array List
     */

        //TODO demonstrate with ca.nl.cna.java2.collections.Foo class?

        List<Integer> integerList = getRandomList(new Random().nextInt(30) + 20, 50);
        System.out.println("Here's a random list:");
        printIntegerList(integerList, System.out);

        System.out.println("\n\nUsing an Iterator! (Old Skool)");
        Iterator<Integer> iterator = integerList.listIterator();
        while(iterator.hasNext()){
            System.out.printf("%d,", iterator.next());
        }

        System.out.println("\n\nUsing an For Loop! (Even Older Skool)");
        for (int i = 0; i < integerList.size(); i++) {
            System.out.printf("%d,", integerList.get(i));
        }

        System.out.println("\n\nUsing an Foreach Loop! Good Approach");
        for (int i: integerList) {
            System.out.printf("%d,", i);
        }

        System.out.println("\n\nUsing the .forEach method and Lambda! Good Approach");
        integerList.forEach(i -> System.out.printf("%d,", i));

        //Sorting with an anonymous comparator class
        integerList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        });

        System.out.println("\nLet's Sort! Using Lambda");
        integerList.sort((i,j)->Integer.compare(i,j));

        integerList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });


        System.out.println("\n\nPrint Sorted List");
        integerList.forEach(i -> System.out.printf("%d,", i));

    }

    /**
     * Great a random list of integers between 10 and 40
     * //TODO make the size of the list a parameter?
     * @return
     */
    public static List<Integer> getRandomList(int listSize, int upperBound){
        Random random = new Random();
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(upperBound) - 25);
        }
        return list;
    }

    /**
     * Print out the list as CSV to the print stream
      * @param list
     * @param printStream
     */
    public static void printIntegerList(List<Integer> list, PrintStream printStream){
        list.forEach(i -> printStream.printf("%d,", i));
    }

}

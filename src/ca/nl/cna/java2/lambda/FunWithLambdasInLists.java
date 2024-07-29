package ca.nl.cna.java2.lambda;

import java.io.PrintStream;
import java.util.*;

/**
 * Playing around with List objects. Showing the differences in implementation and how to iterate
 *
 * @author Josh
 */
public class FunWithLambdasInLists {

    public static void main(String[] args) {
        System.out.println("Fun with Lists!");

        //TODO demonstrate with ca.nl.cna.java2.collections.Foo class?

        List<Integer> integerList = getRandomList(new Random().nextInt(30) + 20, 50);
        System.out.println("\n\nUsing the .forEach method and Lambda! Good Approach");
        integerList.forEach(i -> System.out.printf("%d,", i));

        System.out.println("\nLet's Sort! Using Lambda");
        //integerList.sort((x,y) -> Integer.compare(x,y));
        integerList.sort(Integer::compareTo);


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

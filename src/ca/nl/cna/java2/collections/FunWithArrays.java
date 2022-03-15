package ca.nl.cna.java2.collections;

import java.util.*;

public class FunWithArrays {

    public static void main(String[] args) {

        System.out.println("Fun with Arrays full of ca.nl.cna.java2.collections.Foo!?");

        Foo[] fooArray = getRandomFoos();

//        for (int i = 0; i < fooArray.length ; i++) {
//            System.out.printf("%d (%s), ", fooArray[i].getI(), fooArray[i].getVar());
//        }
//
        List<Foo> fooList = Arrays.asList(fooArray);

        List<Foo> fooLinkedList = new LinkedList<>();

        Queue<Foo> fooQueue = new LinkedList<>();


//
//        System.out.println("\nFoo List now");
//        printList(fooList);
//
//        System.out.println("\nSorting.....");
//        fooList.sort(((o1, o2) -> Integer.compare(o1.getI(),o2.getI())));
//        printList(fooList);
//
//        System.out.println("\nReverse it.....");
//        Collections.reverse(fooList);
//        printList(fooList);
//
//        System.out.println("\nShuffle it.....");
//        Collections.shuffle(fooList);
//        printList(fooList);



//        System.out.println("\nBack to an Array");
//
//        ca.nl.cna.java2.collections.Foo[] setupArray = new ca.nl.cna.java2.collections.Foo[fooList.size()];
//        //ca.nl.cna.java2.collections.Foo[] reverseFooArray = fooList.toArray(new ca.nl.cna.java2.collections.Foo[0]);
//        setupArray = fooList.toArray(new ca.nl.cna.java2.collections.Foo[0]);
//
//        for (int i = 0; i < setupArray.length ; i++) {
//            System.out.printf("%d (%s), ", setupArray[i].getI(), setupArray[i].getVar());
//        }

    }

    public static void printList(List<Foo> fooList){
        for (Foo foo: fooList) {
            System.out.printf("%d (%s), ", foo.getNum(), foo.getVar());
        }
    }

    public static Foo[] getRandomFoos(){
        Random random = new Random();

        Foo[] fooArray = new Foo[10];

        for (int i = 0; i < 10; i++) {
            fooArray[i] = new Foo("Blah", random.nextInt(100));

        }
        return fooArray;
    }

}

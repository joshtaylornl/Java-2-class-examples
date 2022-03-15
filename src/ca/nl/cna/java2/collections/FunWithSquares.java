package ca.nl.cna.java2.collections;

import java.io.PrintStream;
import java.util.*;

/**
 * Fun with Squares
 */
public class FunWithSquares {

    public static void main(String[] args) {
        System.out.println("Fun with Squares");

        Square square = new Square(5);


        List<Square> squareList = getSquareList();
        System.out.println("Here we go");
        printList(squareList, System.out);

//        squareList.sort(new Comparator<ca.nl.cna.java2.collections.Square>() {
//            @Override
//            public int compare(ca.nl.cna.java2.collections.Square o1, ca.nl.cna.java2.collections.Square o2) {
//                return Integer.compare(o1.area(),o2.area());
//            }
//        });

        squareList.sort((o1,o2)->Integer.compare(o1.area(),o2.area()));


        System.out.println("Here we go again");
        printList(squareList, System.out);
    }

    public static void printList(Collection<Square> squareCollection, PrintStream printStream){
        for (Square square : squareCollection) {
            printStream.println(square.getDescription());
        }
    }

    public static List<Square> getSquareList(){
        Random random = new Random();
        List<Square> squareList = new LinkedList<>();
        int num = random.nextInt(25);
        for (int i = 0; i < num ; i++) {
            squareList.add(new Square(random.nextInt(15) + 5));
        }

        return squareList;
    }


}

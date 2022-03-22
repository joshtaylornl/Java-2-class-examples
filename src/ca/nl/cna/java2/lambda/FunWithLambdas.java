package ca.nl.cna.java2.lambda;

import java.util.LinkedList;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/**
 * Fun with Lambdas. Going to build up a simple random list and sort it. Then use Lambda's to do each step.
 *
 * @author Josh
 */
public class FunWithLambdas {

    public static void main(String[] args) {
        System.out.println("Fun with Lambdas!");
        LinkedList<Integer> randomList = new LinkedList<>();

        //Lamda to Supply random numbers
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);

        //Lamda to Consume the list and print it out
        BiConsumer<String, LinkedList<Integer>> printList = (s, list) -> {
            System.out.printf("%s", s);
            list.forEach((i)->System.out.printf("%d, ", i));
        };

        for (int i = 0; i < 25; i++) {
            randomList.add(randomSupplier.get());
        }

        printList.accept("\n\nLambda Printing List: \n", randomList);

        //Lamda for sorting - turned into Function Reference by IntelliJ recommendation!
        randomList.sort(Integer::compare);

        printList.accept("\n\nLambda Printing List after sort: \n", randomList);
    }



}

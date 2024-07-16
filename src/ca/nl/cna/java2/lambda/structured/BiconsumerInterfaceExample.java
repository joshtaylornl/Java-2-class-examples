package ca.nl.cna.java2.lambda.structured;

import java.util.function.BiConsumer;

public class BiconsumerInterfaceExample {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> multiply = (x, y) ->
                System.out.println("Multiplication of the two numbers is: "+x*y);
        BiConsumer<Integer, Integer> divide = (x,y) ->
                System.out.println("Division of the two numbers is: "+x/y);
        multiply.andThen(divide).accept(10,5);
    }
}

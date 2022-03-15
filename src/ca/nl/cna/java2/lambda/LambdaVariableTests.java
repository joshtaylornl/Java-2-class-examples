package ca.nl.cna.java2.lambda;

import java.util.function.IntFunction;

public class LambdaVariableTests {

    public static void main(String[] args) {
        Runnable greeting = () -> System.out.println("Testing lambda variables");
        greeting.run();

        //Try some math
        IntFunction<Integer> getDouble = (int x) -> x * 2;
        int i = 12;
        System.out.printf("%d doubled: %d", i, getDouble.apply(i));

    }

}

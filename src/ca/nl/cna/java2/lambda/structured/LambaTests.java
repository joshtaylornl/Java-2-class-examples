package ca.nl.cna.java2.lambda.structured;

public class LambaTests {

    public static void main(String[] args) {

        // Lambda Expreassion 1
        MyFunctionalInterface f = (int a, int b) -> {
            System.out.println(a * b);
        };
        f.math(4, 5);// 20


        // Lambda Expreassion 2
        MyFunctionalInterface f2 = (a, b) -> System.out.println(a + b);
        f2.math(4, 5);// 9



    }
}

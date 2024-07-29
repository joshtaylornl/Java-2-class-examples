package ca.nl.cna.java2.lambda.structured;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    static Predicate<Integer> even = integer -> integer%2==0;
    static Predicate<Integer> p1 = integer -> integer%2==0;

    public static void predicateOr(){

        System.out.println("Example of predicate OR: " +even.or(p1).test(10)); //predicate chaining
    }
    public static void predicateAnd(){

        System.out.println("Example of predicate AND: " +even.and(p1).test(9));
    }
    public static void main(String[] args) {


        System.out.println(even.test(6));
        predicateAnd();
        predicateOr();
    }
}

package ca.nl.cna.java2.lambda.structured;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


public class MoreLambdaTests {

    public static void main(String[] args) {

        Supplier supplier = () -> (int)(Math.random() * 1000);
        System.out.println(supplier.get());


        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("Java is cool");


        Consumer<Integer> c2 = (integer) -> System.out.println("Value of integer is: "+integer);
        Consumer<Integer> c3 = (integer) -> System.out.println("Value of square is: " +integer*integer);

        List<Integer> integerList = Arrays.asList(1,2,3,4);
        integerList.forEach(c2.andThen(c3));


        BiConsumer<Integer, Integer> multiply = (x, y) -> System.out.println("Multiplication of the two numbers is: "+x*y);
        BiConsumer<Integer, Integer> divide = (x,y) -> System.out.println("Division of the two numbers is: "+x/y);
        multiply.andThen(divide).accept(10,5);


        Function<String, String> function = (name) -> name.toUpperCase();
        Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("default");

        System.out.println("Result of an uppercase function is : " +function.apply("java"));
        System.out.println("Result of function and then another is : " +function.andThen(addSomeString).apply("java"));
        System.out.println("Result of compose method is : " +function.compose(addSomeString).apply("java"));






    }

}

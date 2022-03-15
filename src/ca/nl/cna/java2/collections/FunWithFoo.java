package ca.nl.cna.java2.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FunWithFoo {

    public static void main(String[] args) {
        System.out.println("Fun with ca.nl.cna.java2.collections.Foo");
        List<Foo> fooList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            fooList.add(getRandomFoo());
        }

        System.out.println("\nI printme the foo");
        fooList.forEach(foo -> printFoo(foo));

        fooList.sort((f1, f2) -> f2.compare(f1, f2));

        System.out.println("\nI sorted the foo");
        fooList.forEach(foo -> printFoo(foo));

    }

    /**
     * Generate a Random ca.nl.cna.java2.collections.Foo
     * @return
     */
    public static Foo getRandomFoo(){
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return new Foo(generatedString, random.nextInt(1000));
    }

    public static void printFoo(Foo foo){
        System.out.printf("\nfoo: %d, %s", foo.getNum(), foo.getVar());
    }

}

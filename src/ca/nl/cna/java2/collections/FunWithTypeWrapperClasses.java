package ca.nl.cna.java2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Play around with Type Wrapper Classes
 *
 * @author Josh
 */
public class FunWithTypeWrapperClasses {

    public static void main(String[] args) {
        System.out.println("Fun with type wrapper classes!");

        int n = 12;     //Do this
        Integer m = 10; //Don't do this

        System.out.printf("Sum: %d + %d, max: %d\n", n, m, Integer.max(n,m));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(n);
        integerList.add(m);

//        for (int k: integerList) {
//            System.out.printf("\n> %d", k);
//        }

        integerList.forEach(i -> System.out.printf("\n> %d", i));



    }

}

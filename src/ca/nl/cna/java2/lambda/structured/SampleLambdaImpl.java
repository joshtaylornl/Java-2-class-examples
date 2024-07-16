package ca.nl.cna.java2.lambda.structured;

public class SampleLambdaImpl {

    public static void main(String[] args) {
        StringLength legthLambda = (String s) -> s.length();
        System.out.println(legthLambda.getLength("Hello World")); //11
    }

    interface StringLength{
        int getLength(String s);
    }
}

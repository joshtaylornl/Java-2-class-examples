package ca.nl.cna.java2.lambda.structured;

/**
 * Sample lamda example using a functional interface
 */
public class SampleLambdaImpl {

    public static void main(String[] args) {
        //Old method using an anonymous class
        StringLength lengthAnon = new StringLength() {
            @Override
            public int getLength(String s) {
                return s.length();
            }
        };
        System.out.println(lengthAnon.getLength("Hello Old World!"));

        //Easier & cleaner way with a Lambda
        StringLength lengthlambda = s -> s.length();
        System.out.println(lengthlambda.getLength("Hello World")); //11
    }

    interface StringLength{
        int getLength(String s);
    }
}

package ca.nl.cna.java2.regex;

/**
 * A class to play around with Strings and Characters.
 * Proving that Strings are not immutable
 * @author Josh
 */
public class FunWithStringsBeingImmutible {

    public static void main(String[] args) {
        System.out.println("Fun with Strings!");

        //1) Demonstrate Strings are Immutables
        String stringExample = "josh taylor";
        String saveIt = stringExample;
        stringExample = stringExample.toUpperCase(); //The string is REASSIGNED not modified
        System.out.println(stringExample);
        System.out.println(saveIt);

        //2) Demonstrate Strings are immutable as a attribute of an object
        Person person = new Person("Josh", "Taylor");
        Person savePerson = person;
        person = new Person("blah", "blah");

        System.out.printf("\nPerson: %s %s", person.getFirstName(), person.getLastName());
        System.out.printf("\nPerson: %s %s", savePerson.getFirstName(), savePerson.getLastName());

        //3) Demonstrated Object Serialization



    }

}

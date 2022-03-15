package ca.nl.cna.java2.regex;

import java.io.Serializable;

/**
 * Simple class that is used to demonstrate Object Serialization and the danger in passing a full class into a method
 * //TODO Document these! #practiceWhatYouPreach
 *
 * @author Josh
 */
public class Person implements Serializable {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

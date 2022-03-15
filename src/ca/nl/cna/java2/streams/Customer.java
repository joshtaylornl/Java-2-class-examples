package ca.nl.cna.java2.streams;

import java.io.Serializable;

/**
 * Simple Customer class to demonstrate serializing objects
 *
 * @author Josh
 */
public class Customer implements Serializable {

    private String firstName;
    private String lastName;
    private String id;
    private int points;

    public Customer(String firstName, String lastName, String id, int points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.points = points;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}

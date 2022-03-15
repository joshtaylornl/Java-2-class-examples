package ca.nl.cna.java2.streams;

import java.io.Serializable;

/**
 * Contact class - poorly named for a poorly defined assignment :/
 *
 * @author Josh
 */
public class Contact implements Serializable {

    public static final String EMAIL_REGEX = "^(.+)@(.+)$";
    public static final String PHONE_NUM_REGEX = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$";

    //Note: assigment said "Contact Info". I will use this approach
    private String name;
    private String email;
    private String phoneNumber;

    public Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        //TODO consider only allowing valid emails!
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        //TODO consider only allowing valid phone numbers!
        this.phoneNumber = phoneNumber;
    }

    /**
     * Determine if an email is valid
     * @param email
     * @return
     */
    public static boolean isValidEmail(String email){
        return email.matches(EMAIL_REGEX);
    }

    public static boolean isValidPhoneNumber(String phoneNumber){
        return phoneNumber.matches(PHONE_NUM_REGEX);
    }


}

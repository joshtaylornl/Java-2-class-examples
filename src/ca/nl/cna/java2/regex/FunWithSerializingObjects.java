package ca.nl.cna.java2.regex;

import java.io.*;

/**
 * Playing around with object Serialization
 *
 * @author Josh
 */
public class FunWithSerializingObjects {

    public static void main(String[] args) {
        System.out.println("Fun with Serializing Objects!");
        Person originalJosh = new Person("Josh", "Taylor");

        String fileName = "PersonObj.ser";
        File file = new File(fileName);

        //Write the object out to the file
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(originalJosh);
        } catch (IOException e) {
            e.printStackTrace();
        }

        originalJosh.setFirstName("OGJosh");

        Person cloneJosh = null;
        try{
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            cloneJosh = (Person) objectInputStream.readObject();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\nOriginal: ");
        printPersonInfo(originalJosh);

        System.out.println("\nClone: ");
        printPersonInfo(cloneJosh);


    }

    /**
     * Simple method to print out a Person objects state
     * @param person
     */
    public static void printPersonInfo(Person person){
        System.out.printf("\nPerson: %s, %s", person.getFirstName(), person.getLastName());
    }


}

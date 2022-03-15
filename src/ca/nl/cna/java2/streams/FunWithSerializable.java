package ca.nl.cna.java2.streams;

import java.io.*;

/**
 * Having fun with Serializing objects
 *
 * @author Josh
 */
public class FunWithSerializable {

    public static void main(String[] args) {
        System.out.println("Fun with Serializing Objects!");

        //Create a simple object
        Customer customer = new Customer("Josh", "Taylor", "1001", 1098989);
        printCustomer(customer);

        //Serialized the object and saved it to a file
        String fileName = "CustomerObj.ser";
        try {
            File file = new File(fileName);     //Find or create the file
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(customer);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Create a new object and deserialize the customer from the file
        Customer customerFromFile = null;
        try{
            File file = new File(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            customerFromFile = (Customer) objectInputStream.readObject();
            printCustomer(customerFromFile);
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void printCustomer(Customer customer){
        System.out.printf("\nCustomer> %s %s, id: %s, number: %d ", customer.getFirstName(), customer.getLastName(), customer.getId(), customer.getPoints());
    }

}

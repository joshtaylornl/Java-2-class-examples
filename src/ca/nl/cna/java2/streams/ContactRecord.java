package ca.nl.cna.java2.streams;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Contract record main class
 */
public class ContactRecord {

    public static void main(String[] args) {
        System.out.println("Fun with Contacts!");

//        List<Contact> contactList = getContacts();
//
//        printList(contactList);

        //writeContactsToFile(contactList, new File("Contacts.ser"));

        List<Contact> contactList = readContactsFromFile(new File("Contacts.ser"));
        printList(contactList);

        //TODO manipulate Contacts


    }

    /**
     * Get a list of contacts for testing
     * @return
     */
    public static List<Contact> getContacts(){
        List<Contact> contactList = new LinkedList<>();
        contactList.add(new Contact("josh", "test@abc.com", ""));
        contactList.add(new Contact("jim", "", "709.555.5555"));
        contactList.add(new Contact("jane", "janedoe@email.com", "709.555.1234"));
        return contactList;
    }

    /**
     * Dump out the contact list
     * @param contactList
     */
    public static void printList(List<Contact> contactList){
        contactList.forEach(c -> System.out.printf("\n%s / %s / %s", c.getName(), c.getEmail(), c.getPhoneNumber()));
    }

    /**
     * Write the contacts to a file
     * @param file File
     */
    public static void writeContactsToFile(List<Contact> contactList, File file){
        //TODO Write this
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            for (Contact c: contactList) {
                objectOutputStream.writeObject(c);
            }
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Read the contacts from a file
     * @return
     */
    public static List<Contact> readContactsFromFile(File file){
        List<Contact> contactList = new LinkedList<>();
        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

            Contact c = (Contact) objectInputStream.readObject();
            while (c != null) {
                contactList.add(c);
                c = (Contact) objectInputStream.readObject();
                //TODO Hang your head in shame
            }


        } catch (IOException e){
            //e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return contactList;
    }


}

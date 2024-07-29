package ca.nl.cna.java2.utilities;
import java.io.*;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        Properties properties = new Properties();

        // Set properties
        properties.setProperty("username", "admin");
        properties.setProperty("password", "Password2");

        // Save properties to a file
        try (OutputStream out = new FileOutputStream("config.properties")) {
            properties.store(out, "Configuration Settings");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Load properties from a file
        try (InputStream in = new FileInputStream("config.properties")) {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Retrieve properties
        String username = properties.getProperty("username");  // Output: admin
        String password = properties.getProperty("password");  // Output: 12345

        System.out.printf("Username: %s, \nPassword: %s", username, password);
    }
}

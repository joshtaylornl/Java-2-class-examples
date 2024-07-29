package ca.nl.cna.java2.utilities;

public class BitManipulationExample {
    public static void main(String[] args) {
        int number = 0b0101;  // Binary representation: 0101 (decimal: 5)

        System.out.println("\n> " + number);

        // Set the 1st bit (counting from 0)
        number |= (1 << 1);  // Result: 0111 (decimal: 7)
        System.out.println("\n> " + number);

        // Clear the 2nd bit
        number &= ~(1 << 2);  // Result: 0011 (decimal: 3)
        System.out.println("\n> " + number);

        // Toggle the 0th bit
        number ^= (1 << 0);  // Result: 0010 (decimal: 2)
        System.out.println("\n> " + number);

        // Check if the 1st bit is set
        boolean isBitSet = (number & (1 << 1)) != 0;  // Output: true

        System.out.println("Number after bit manipulation: " + number);  // Output: 2
        System.out.println("Is 1st bit set? " + isBitSet);  // Output: true
    }
}

package bitmanipulation;

import java.util.Scanner;

public class BinaryToDecimal {

    public static int binToDec(String s) {
        int pow2 = 1; // Variable to track powers of 2
        int d = 0; // Decimal result

        // Process binary string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') { // If the bit is 1, add corresponding power of 2
                d = d + pow2;
            }
            pow2 = pow2 * 2; // Update to the next power of 2
        }

        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a binary number to convert into decimal:");
        
        // Read the binary string input
        String binaryStr = sc.nextLine(); 
        
        // Validate input
        if (!binaryStr.matches("[01]+")) { // Ensure only '0' and '1' characters are allowed
            System.out.println("Invalid binary number. Please enter a valid binary number.");
        } else {
            int decimalValue = binToDec(binaryStr); // Convert binary to decimal
            System.out.println("Decimal representation: " + decimalValue);
        }
        
        sc.close(); // Close the scanner
    }
}

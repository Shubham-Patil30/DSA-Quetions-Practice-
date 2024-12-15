package bitmanipulation;

import java.util.Scanner;

public class DecimalToBinary {
    
    public static String decToBin(int n) {
        String bin = "";
        while (n > 0) { // Corrected condition
            int x = n % 2; // Get the remainder (0 or 1)
            n = n / 2; // Update n by dividing it by 2
            bin = x + bin; // Append the remainder to the binary string
        }
        
        // Handle the case when n is 0
        if (bin.isEmpty()) {
            bin = "0";
        }
        
        return bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter number to convert into binary:");
        int num = sc.nextInt(); 
        
        String b = decToBin(num);
        System.out.println("Binary representation: " + b);
        
        sc.close(); // Close the scanner to free resources
    }
}

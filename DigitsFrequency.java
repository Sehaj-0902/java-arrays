// Create DigitsFrequency class to find the frequency of each digit in a number using array

// Import Scanner class from java.util package
import java.util.Scanner;

public class DigitsFrequency {
    	public static void main(String[] args) {
        	// Create a Scanner object
	        Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a number: ");
        	int number = sc.nextInt();

        	// Find the count of digits in the number
        	int tempNumber = number;
        	int digitCount = 0;
        	while (tempNumber != 0) {
            		tempNumber /= 10;
            		digitCount++;
        	}

        	// Find the digits in the number and store them in an array
        	int[] digits = new int[digitCount];
        	tempNumber = number;
        	int index = 0;
        	while (tempNumber != 0) {
            		digits[index] = tempNumber % 10;
            		tempNumber /= 10;
            		index++;
        	}

        	// Find the frequency of each digit in the number
		// Declare frequency array of size 10 (digits 0-9)
        	int[] frequency = new int[10];
        	for (int i = 0; i < digitCount; i++) {
            		frequency[digits[i]]++;
        	}

        	// Print the frequency of each digit in the number
        	System.out.println("Digit frequencies:");
        	for (int i = 0; i < 10; i++) {
            		if (frequency[i] > 0) {
                		System.out.println("Frequency of " + i + ": " + frequency[i]);
            		}
        	}
    	}
}

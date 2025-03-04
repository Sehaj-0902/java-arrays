// Create ReverseNumber class to reverse the digits of a number using an array

// Import Scanner class from java.util package
import java.util.Scanner;

public class ReverseNumber {
    	public static void main(String[] args) {
        	// Create a Scanner object
        	Scanner sc = new Scanner(System.in);

        	// Take user input for a number
        	System.out.print("Enter a number: ");
        	int number = sc.nextInt();

        	// Find the count of digits in the number
        	int tempNumber = number;
        	int digitCount = 0;
        	while (tempNumber != 0) {
            		tempNumber /= 10;
            		digitCount++;
        	}

        	// Find the digits in the number and store them in the array
        	int[] digits = new int[digitCount];
        	tempNumber = number;
        	int index = 0;
        	while (tempNumber != 0) {
            		digits[index] = tempNumber % 10;
            		tempNumber /= 10;
            		index++;
        	}

        	// Print the elements of the array in reverse order
        	System.out.print("Th reversed number is: ");
        	for (int i = 0; i < digitCount; i++) {
            		System.out.print(digits[i]);
        	}
    	}
}

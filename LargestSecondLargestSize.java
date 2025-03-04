// Create LargestSecondLargestSize class to find the largest and second largest digits of a number

// Import Scanner class from java.util package
import java.util.Scanner;

public class LargestSecondLargestSize {
	public static void main(String[] args) {
        	// Create a Scanner object
        	Scanner sc = new Scanner(System.in);

        	// Take user input for the number
        	System.out.print("Enter a number: ");
        	int number = sc.nextInt();

        	// Define an array digits to store the digits
        	int maxDigit = 10;
        	int[] digits = new int[maxDigit];

        	// Create an integer variable index
        	int index = 0;

        	// Iterate until the number is not equal to 0
        	while (number != 0) {
            		digits[index] = number % 10;
            		number /= 10;

            		// Increment the index
            		index++;

            		// If the index count equals maxDigit, then increase the array size
            		if (index == maxDigit) {
                		maxDigit += 10;
                		int[] temp = new int[maxDigit];
                		System.arraycopy(digits, 0, temp, 0, digits.length);
                		digits = temp;
            		}
        	}

        	// Create variables to store largest and second largest digit
        	int largest = 0;
        	int secondLargest = 0;

        	// Loop through the array and find the largest and second largest number
        	for (int i = 0; i < index; i++) {
            		if (digits[i] > largest) {
                		secondLargest = largest;
                		largest = digits[i];
            		}
			else if (digits[i] > secondLargest && digits[i] != largest) {
                		secondLargest = digits[i];
            		}
        	}

        	// Print the largest and second-largest number
       	 	System.out.println("Largest digit: " + largest);
        	System.out.println("Second largest digit: " + secondLargest);
    	}
}

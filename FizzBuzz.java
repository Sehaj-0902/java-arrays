// Create FizzBuzz class to implement FizzBuzz using an array

// Import Scanner class from java.util package
import java.util.Scanner;

public class FizzBuzz {
    	public static void main(String[] args) {
        	// Create a Scanner object
		Scanner sc = new Scanner(System.in);

        	// Take user input for the number
        	System.out.print("Enter a positive integer: ");
        	int number = sc.nextInt();

        	// Check if the number is a positive integer
        	if (number <= 0) {
            		System.out.println("Please enter a positive number");
            		return;
        	}

        	// Create a String array to save the results
        	String[] str = new String[number + 1];

        	// Iterate from 0 to the number and store Fizz, Buzz, or FizzBuzz
        	for (int i = 0; i <= number; i++) {
			// Check if i is a multiple of 3 and 5
            		if (i % 3 == 0 && i % 5 == 0) {
                		str[i] = "FizzBuzz";
            		}
			// Check if i is a multiple of 3
			else if (i % 3 == 0) {
                		str[i] = "Fizz";
            		}
			// Check if i is a multiple of 5
			else if (i % 5 == 0) {
                		str[i] = "Buzz";
            		}
			// If not a multiple of 3 or 5, print value of i
			else {
                		str[i] = String.valueOf(i);
            		}
        	}

        	// Print the output
        	System.out.println("FizzBuzz Results:");
        	for (int i = 1; i <= number; i++) {
            		System.out.println("Position " + i + " = " + str[i]);
        	}
    	}
}

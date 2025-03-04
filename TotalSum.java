// Create TotalSum class to store maximum of 10 values in an array or until user enters 0 or a negative number
// Display the values and print the total sum of the values

// Import Scanner class from java.util package
import java.util.Scanner;

public class TotalSum {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);

		// Declare and initialize an array elements of size 10
		double[] elements = new double[10];

		// Create a variable totalSum initialized to 0.0
		double totalSum = 0.0;

		// Create a variable index for the array, initialized to 0
		int index = 0;

		// Using an infinite while loop
		while (true) {
			System.out.println("Enter a number (0 or negative number to stop): ");
            		double number = sc.nextDouble();

			if (number <= 0 || number >= 10) {
				break;
			}

			// Assign number to the array element
			elements[index] = number;

			// Increment the index
			index++;
		}

		// Use for loop to add values of elements to the total sum
		for (int i = 0; i < index; i++) {
			totalSum += elements[i];
		}

		// Print the total value of sum
		System.out.println("The total value is: " + totalSum);
	}
}

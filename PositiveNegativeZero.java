// Create PositiveNegativeZero class to check if a number is positive, negative or zero and using an array to store elements
// If the number is positive then check if the number is even or odd

// Import Scanner class from java.util package
import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);

		// Define an array elements of size 5
		int[] elements = new int[5];

		// Store input elements in array
		System.out.println("Enter the elements of array: ");
		for(int i = 0; i < elements.length; i++) {
			elements[i] = sc.nextInt();
		}

		// Check if the number is Positive, Negative or Zero
		for(int i = 0; i < elements.length; i++) {
			if (elements[i] > 0) {
				// Check if the number if even or odd
				if (elements[i] % 2 == 0) {
					System.out.println("The number is Positive and is Even");
				}
				else {
					System.out.println("The number is Positive and is Odd");
				}
			}
			else if (elements[i] < 0) {
				System.out.println("The number is Negative");
			}
			else {
				System.out.println("The number is Zero");
			}
		}
	}
}

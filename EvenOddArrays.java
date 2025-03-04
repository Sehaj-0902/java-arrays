// Create a class EvenOddArrays to store even and odd numbers between 1 to the number eneterd by the user in the arrays
// Print the even and odd arrays using even and odd index

// Import Scanner class from java.util package
import java.util.Scanner;

public class EvenOddArrays {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);

		// Create a variable number to store input integer
		int number = sc.nextInt();

		// Check if the number is a natural number
		// If not a natural number, print an error and exit the program
		if (number <= 0) {
			System.err.println("Not a natural number");
			System.exit(0);
		}

		// Declare and initialize array to store even numbers of size = number / 2 + 1
		int[] evenArray = new int[number / 2 + 1];

		// Declare and initialize array to store odd numbers of size = number / 2 + 1
		int[] oddArray = new int[number / 2 + 1];

		// Create a variable evenIndex initialized to 0
		int evenIndex = 0;

		// Create a variable oddIndex initialized to 0
		int oddIndex = 0;

		// Iterate from 1 to number, save even or odd number in corresponding array
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				evenArray[evenIndex] = i;
				evenIndex++;
			}
			else {
				oddArray[oddIndex] = i;
				oddIndex++;
			}
		}

		// Print array of even numbers
		System.out.println("Array of even numbers: ");
		for (int i = 0; i < evenIndex; i++) {
			System.out.print(evenArray[i] + " ");
		}

		System.out.println();

		// Print array of odd numbers
		System.out.println("Array of odd numbers: ");
		for (int i = 0; i < oddIndex; i++) {
                        System.out.print(oddArray[i] + " ");
                }
	}
}


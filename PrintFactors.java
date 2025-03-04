// Create PrintFactors class to find the factors of a number, store the factors in an array, and display the factors

// Import Scanner class from java.util package
import java.util.Scanner;

public class PrintFactors {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		// Create a variable number to take user input
		int number = sc.nextInt();

		// Create a variable maxFactor and initialize it to 10
		int maxFactor = 10;

		// Declare and initialize an array factors of size maxFactor
		int[] factors = new int[maxFactor];

		// Create a variable index for the array
		int index = 0;

		// Iterate from 1 to number to find factors
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				// If index is equal to maxFactor, reset maxFactor to twice its size
				if (index == maxFactor) {
					maxFactor *= 2;
					// temp array used to store factors array elements
					int[] temp = new int[maxFactor];
					System.arraycopy(factors, 0, temp, 0, factors.length);
					factors = temp;
				}
				factors[index] = i;
				index++;
			}
		}

		// Print factors of the number
		System.out.println("Factors of " + number + ": ");
		for (int i = 0; i < index; i++) {
			System.out.print(factors[i] + " ");
		}
	}
}

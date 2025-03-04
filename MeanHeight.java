// Create MeanHeight class to find the mean height of players of a football team using an array

// Import Scanner class from java.util package
import java.util.Scanner;

public class MeanHeight {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);

		// Declare and initialize an array heights of size 11
		double[] heights = new double[11];

		System.out.println("Enter the elements of array: ");

		// Store input values in the array
		for (int i = 0; i < heights.length; i++) {
			heights[i] = sc.nextDouble();
		}

		// Create a variable sum initialized to 0.0
		double sum = 0.0;

		// Calculate sum of all elements of the array
		for (int i = 0; i < heights.length; i++) {
			sum += heights[i];
		}

		// Create a variable meanHeight to calculate mean height of players of the football team
		// Formula: mean = sum of all elements / number of elements
		double meanHeight = sum / 11;

		// Print the mean height
		System.out.println("The mean height of the players of the football team is " + String.format("%.1f",meanHeight));
	}
}

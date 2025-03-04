// Create MultiplicationTable class to print multiplication table of a number using an array

//Import Scanner class from java.util package
import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		// Define an array of size 10 to store output of multiplication table
		int[] array = new int[10];

		// Perform multiplication using for loop and print the results
		for(int i = 0; i < 10; i++) {
			array[i] = number * (i+1);
			System.out.println(number + " * " + (i+1) + " = " + array[i]);
		}
	}
}

// Create PrintTable class to print multiplication table of a number from 6 to 9 using an array

//Import Scanner class from java.util package
import java.util.Scanner;

public class PrintTable {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		// Define an array of size 4 to store output of multiplication table
		int[] array = new int[4];

		// Perform multiplication using for loop and print the results
		// Iterate the for loop from 6 to 9
		for(int i = 6; i <= 9; i++) {
			array[i-6] = number * i;
			System.out.println(number + " * " + i + " = " + array[i-6]);
		}
	}
}

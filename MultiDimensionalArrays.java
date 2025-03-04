// Create MultiDimensionalArrays class to create a 2D Array and Copy the 2D Array into a single dimension array

// Import Scanner class from java.util package
import java.util.Scanner;

public class MultiDimensionalArrays {
	public static void main(String[] args) {
        	// Create a Scanner object
        	Scanner sc = new Scanner(System.in);

	        // Take user input for rows
        	System.out.print("Enter the number of rows: ");
        	int rows = sc.nextInt();

		// Take user input for columns
        	System.out.print("Enter the number of columns: ");
        	int columns = sc.nextInt();

        	// Declare and initialize a 2D array
        	int[][] array2D = new int[rows][columns];

        	// Input the array elements
        	System.out.println("Enter the elements of the 2D array:");
        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < columns; j++) {
                		array2D[i][j] = sc.nextInt();
            		}
        	}

        	// Declare and initialize a 1D array of size rows*columns
        	int[] array1D = new int[rows * columns];

        	// Create a variable index initialized to 0
        	int index = 0;

        	// Copy elements to the 1D array
        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < columns; j++) {
                		array1D[index] = array2D[i][j];
             			index++;
            		}
        	}

        	// Print 1D array
        	System.out.println("1D Array:");
        	for (int i = 0; i < array1D.length; i++) {
            		System.out.print(array1D[i] + " ");
        	}
    	}
}

// Create CalculateBMI class to find the BMI of all persons in a team using array

// Import Scanner class from java.util package 
import java.util.Scanner;

public class CalculateBMI {
    	public static void main(String[] args) {
        	// Create a scanner object
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the number of persons: ");
	        int numberOfPersons = sc.nextInt();

        	// Create arrays to store weight, height, BMI, and weight status
        	double[] weights = new double[numberOfPersons];
        	double[] heights = new double[numberOfPersons];
        	double[] bmi = new double[numberOfPersons];
        	String[] status = new String[numberOfPersons];

        	// Take input for the weight of the persons
        	for (int i = 0; i < numberOfPersons; i++) {
            		System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            		weights[i] = sc.nextDouble();
		}

		// Take input for the height of the persons
                for (int i = 0; i < numberOfPersons; i++) {
            		System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            		heights[i] = sc.nextDouble();
        	}

        	// Calculate the BMI of all the persons and store them in an array and also find the weight status
        	for (int i = 0; i < numberOfPersons; i++) {
            		double heightInMeters = heights[i] / 100;
            		bmi[i] = weights[i] / (heightInMeters * heightInMeters);

            		if (bmi[i] <= 18.4) {
                		status[i] = "Underweight";
            		}
			else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                		status[i] = "Normal";
            		}
			else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                		status[i] = "Overweight";
            		}
			else {
                		status[i] = "Obese";
            		}
        	}

        	// Print the height, weight, BMI, and weight status of each person
        	System.out.println("\nBMI Results:");
        	for (int i = 0; i < numberOfPersons; i++) {
            		System.out.println("Person " + (i + 1) + ": Weight = " + weights[i] + " kg, Height = " + heights[i] + " cm, BMI = " + String.format("%.1f", bmi[i]) + ", Status = " + status[i]);
        	}
    	}
}

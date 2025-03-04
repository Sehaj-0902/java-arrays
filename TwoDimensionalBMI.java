// Create TwoDimensionalBMI class to find the BMI of all persons in a team using two dimensional array

// Import Scanner class from java.util package
import java.util.Scanner;

public class TwoDimensionalBMI {
	public static void main(String[] args) {
        	// Create a scanner object
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the number of persons: ");
        	int numberOfPersons = sc.nextInt();

        	// Create a 2D array to store weight, height, and BMI
        	double[][] personData = new double[numberOfPersons][3]; 
        	String[] weightStatus = new String[numberOfPersons];

        	// Take input for weight of the persons
        	for (int i = 0; i < numberOfPersons; i++) {
            		while (true) {
                		System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                		double weight = sc.nextDouble();
                		if (weight > 0) {
                    			personData[i][0] = weight;
                    			break;
                		}
				else {
                    			System.out.println("Weight must be a positive value.");
                		}
            		}
		}

		// Take input for height of the persons
                for (int i = 0; i < numberOfPersons; i++) {
            		while (true) {
                		System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
                		double height = sc.nextDouble();
                		if (height > 0) {
                    			personData[i][1] = height; 
                    			break;
                		}
				else {
                    			System.out.println("Height must be a positive value.");
                		}
            		}
        	}

        	// Calculate the BMI of all the persons and store them in the personData array and also find the weight status
        	for (int i = 0; i < numberOfPersons; i++) {
            		double heightInMeters = personData[i][1] / 100;
            		personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters);

            		if (personData[i][2] <= 18.4) {
                		weightStatus[i] = "Underweight";
            		}
			else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                		weightStatus[i] = "Normal";
            		}
			else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                		weightStatus[i] = "Overweight";
            		}
			else {
                		weightStatus[i] = "Obese";
            		}
        	}

        	// Print the height, weight, BMI, and weight status of each person
        	System.out.println("\nBMI Results:");
        	for (int i = 0; i < numberOfPersons; i++) {
            		System.out.println("Person " + (i + 1) + ": Weight = " + personData[i][0] + " kg, Height = " + personData[i][1] + " cm, BMI = " + String.format("%.1f", personData[i][2]) + ", Status = " + weightStatus[i]);
        	}
    	}
}

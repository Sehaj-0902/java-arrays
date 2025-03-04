// Create StudentGrades class to calculate percentage and grade based on subject marks using array

// Import Scanner class from java.util package
import java.util.Scanner;

public class StudentGrades {
    	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the number of students: ");
        	int numberOfStudents = sc.nextInt();

        	// Define arrays to store marks, percentages, and grades of the students
		double[] physicsMarks = new double[numberOfStudents];
        	double[] chemistryMarks = new double[numberOfStudents];
        	double[] mathsMarks = new double[numberOfStudents];
        	double[] percentages = new double[numberOfStudents];
        	String[] grades = new String[numberOfStudents];

        	// Take input for marks of students in physics
	        for (int i = 0; i < numberOfStudents; i++) {
            		while (true) {
                		System.out.print("Enter marks for Physics for student " + (i + 1) + ": ");
                		double mark = sc.nextDouble();
                		if (mark >= 0) {
                    			physicsMarks[i] = mark;
                    			break;
                		}
				else {
                    			System.out.println("Marks must be non-negative.");
                		}
            		}
		}

		// Take input for marks of students in chemistry
                for (int i = 0; i < numberOfStudents; i++) {
                        while (true) {
                                System.out.print("Enter marks for Chemistry for student " + (i + 1) + ": ");
                                double mark = sc.nextDouble();
                                if (mark >= 0) {
                                        chemistryMarks[i] = mark;
                                        break;
                                }
                                else {
                                        System.out.println("Marks must be non-negative.");
                                }
                        }
                }

		// Take input for marks of students in maths
                for (int i = 0; i < numberOfStudents; i++) {
                        while (true) {
                                System.out.print("Enter marks for Maths for student " + (i + 1) + ": ");
                                double mark = sc.nextDouble();
                                if (mark >= 0) {
                                        mathsMarks[i] = mark;
                                        break;
                                }
                                else {
                                        System.out.println("Marks must be non-negative.");
                                }
                        }
                }

        	// Calculate the percentage and grade of the students based on the percentage
        	for (int i = 0; i < numberOfStudents; i++) {
            		double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            		percentages[i] = (totalMarks / 300) * 100;

            		if (percentages[i] >= 80) {
                		grades[i] = "A";
            		}
			else if (percentages[i] >= 70) {
                		grades[i] = "B";
            		}
			else if (percentages[i] >= 60) {
                		grades[i] = "C";
            		}
			else if (percentages[i] >= 50) {
                		grades[i] = "D";
            		}
			else if (percentages[i] >= 40) {
                		grades[i] = "E";
            		}
			else {
                		grades[i] = "R";
            		}
        	}

        	// Print the marks, percentages, and grades of each student
        	System.out.println("\nStudent Results:");
        	for (int i = 0; i < numberOfStudents; i++) {
         		System.out.println("Student " + (i + 1) + ": Physics = " + physicsMarks[i] + ", Chemistry = " + chemistryMarks[i] + ", Maths = " + mathsMarks[i]);
			System.out.println("Percentage = " + String.format("%.2f", percentages[i]) + "%, Grade = " + grades[i]);
        	}
    	}
}

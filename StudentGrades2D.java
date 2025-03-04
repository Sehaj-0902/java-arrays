// Create StudentGrades2D class to calculate percentage and grade based on subject marks using 2D array

// Import Scanner class from java.util package
import java.util.Scanner;

public class StudentGrades2D {
    	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the number of students: ");
        	int numberOfStudents = sc.nextInt();

        	// Define arrays to store marks, percentages, and grades of the students
        	double[][] marks = new double[numberOfStudents][3]; 
        	double[] percentages = new double[numberOfStudents];
        	String[] grades = new String[numberOfStudents];

        	// Take input for marks of students in physics, chemistry, and maths
        	for (int i = 0; i < numberOfStudents; i++) {
            		for (int j = 0; j < 3; j++) {
                		while (true) {
                    			String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                    			System.out.print("Enter marks for " + subject + " for student " + (i + 1) + ": ");
                    			double mark = sc.nextDouble();
                    			if (mark >= 0) {
                        			marks[i][j] = mark;
                        			break;
                    			}
					else {
                        			System.out.println("Marks must be non-negative.");
                    			}
                		}
            		}
        	}

        	// Calculate the percentage and grade of the students based on the percentage
        	for (int i = 0; i < numberOfStudents; i++) {
            		double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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
         		System.out.println("Student " + (i + 1) + ": Physics=" + marks[i][0] + ", Chemistry=" + marks[i][1] + ", Maths=" + marks[i][2]);
			System.out.println("  Percentage=" + String.format("%.2f", percentages[i]) + "%, Grade=" + grades[i]);
        	}
    	}
}

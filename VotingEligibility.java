// Create VotingEligibility class to check if a student can vote based on the age using an array

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);

		// Define an array age of size 10
		int[] age = new int[10];

		// Input array elements using for loop
		for(int i = 0; i < age.length; i++) {
			System.out.print("Enter age of student " + (i+1) + ": ");
			age[i] = sc.nextInt();
		}

		// Traverse the array using for loop to check if the student can vote
		for(int i = 0; i < age.length; i++) {
			if (age[i] >= 18 && age[i] <= 100) {
				System.out.println("The student with the age " + age[i] + " can vote");
			}
			else if (age[i] <= 0) {
				System.out.println("Invalid age");
			}
			else {
				System.out.println("The student with the age " + age[i] + " cannot vote");
			}
		}
	}
}

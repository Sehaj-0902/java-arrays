// Create YoungestTallestFriend class to find the youngest and tallest friend among the 3 friends

// Import Scanner class from java.util package
import java.util.Scanner;

public class YoungestTallestFriend {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);

		// Declare the array ages and heights of size 3
		int[] ages = new int[3];
		double[] heights = new double[3];

		// Declare the array names containing names of the 3 friends
		String[] names = {"Amar", "Akbar", "Anthony"};

		// Input age of the 3 friends
        	for (int i = 0; i < 3; i++) {
            		System.out.print("Enter age of " + names[i] + ": ");
            		ages[i] = sc.nextInt();
		}

		// Input height of the 3 friends
                for (int i = 0; i < 3; i++) {
                        System.out.print("Enter height of " + names[i] + ": ");
                        heights[i] = sc.nextDouble();
                }

		// Find the youngest friend
		int youngestIndex = 0;
		for (int i = 1; i < 3; i++) {
			if (ages[i] < ages[youngestIndex]) {
				youngestIndex = i;
			}
		}

		// Find the tallest friend
                int tallestIndex = 0;
                for (int i = 1; i < 3; i++) {
                        if (heights[i] > heights[tallestIndex]) {
                                tallestIndex = i;
                        }
                }

		// Print the youngest friend
		System.out.println("The youngest friend is " + names[youngestIndex]);

		// Print the tallest friend
                System.out.println("The tallest friend is " + names[tallestIndex]);
	}
}


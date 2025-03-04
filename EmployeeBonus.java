// Create EmployeeBonus class to calculate bonus of employees based on years of service using array

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

public class EmployeeBonus {
	public static void main(String[] args) {
        	// Create a Scanner object
        	Scanner sc = new Scanner(System.in);

		// Define an array salary of size 10
		double[] salary = new double[10];

		// Define an array yearsOfService of size 10
                double[] yearsOfService = new double[10];

		// Define an array salary of size 10
                double[] bonus = new double[10];

		// Define an array salary of size 10
                double[] newSalary = new double[10];

		double totalBonus = 0.0;
		double totalOldSalary = 0.0;
		double totalNewSalary = 0.0;

		// Input salary of employees
		for (int i = 0; i < 10; i++) {
			while (true) {
                		System.out.print("Enter salary for employee " + (i + 1) + ": ");
                		if (sc.hasNextDouble()) {
                    			salary[i] = sc.nextDouble();
                    			if (salary[i] > 0) {
                        			break;
                    			}
					else {
                        			System.out.println("Invalid salary. Please enter a positive number.");
                    			}
                		}
				else {
                    			System.out.println("Invalid salary input. Please enter a number.");
                		}
            		}
		}

		// Input years of service of employees
                for (int i = 0; i < 10; i++) {
                        while (true) {
                                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                                if (sc.hasNextDouble()) {
                                        yearsOfService[i] = sc.nextDouble();
                                        if (yearsOfService[i] > 0) {
                                                break;
                                        }
                                        else {
                                                System.out.println("Invalid years. Please enter a positive number.");
                                        }
                                }
                                else {
                                        System.out.println("Invalid years input. Please enter a number.");
                                }
                        }
                }

		// Calculate bonus, new salary
		for (int i = 0; i < 10; i++) {
			double bonusPercent = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            		bonus[i] = salary[i] * bonusPercent;
            		newSalary[i] = salary[i] + bonus[i];

            		totalBonus += bonus[i];
            		totalOldSalary += salary[i];
            		totalNewSalary += newSalary[i];
		}
		
		// Print Old salary, bonus and New salary of each employee
		System.out.println("\nEmployee Salary and Bonus:");
        	for (int i = 0; i < 10; i++) {
            		System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] + ", Bonus = " + bonus[i] + ", New Salary = " + newSalary[i]);
        	}


		// Print total bonus amount, total old salary, total new salary
		System.out.println("\nTotal Bonus Amount: " + (String.format("%.2f", totalBonus)));
        	System.out.println("Total Old Salary: " + (String.format("%.2f", totalOldSalary)));
        	System.out.println("Total New Salary: " + (String.format("%.2f", totalNewSalary)));
    	}
}

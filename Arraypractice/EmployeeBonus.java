package Arraypractice;
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store employee data
        double[] salaries = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input employee data
        System.out.println("Enter details for 10 employees:");
        for (int i = 0; i < 10; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("\nEmployee " + (i + 1) + " salary: ");
                salaries[i] = scanner.nextDouble();
                System.out.print("Employee " + (i + 1) + " years of service: ");
                yearsOfService[i] = scanner.nextInt();

                // Validate input
                if (salaries[i] <= 0 || yearsOfService[i] < 0) {
                    System.out.println("Invalid input. Please enter positive values.");
                    i--; // Decrement index to re-enter data
                } else {
                    validInput = true;
                }
            }

            totalOldSalary += salaries[i];
        }

        // Calculate bonuses and new salaries
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }

            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results
        System.out.println("\nBonus Details:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary=%.2f, Bonus=%.2f, New Salary=%.2f\n",
                    i + 1, salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.printf("\nTotal Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

    }
}

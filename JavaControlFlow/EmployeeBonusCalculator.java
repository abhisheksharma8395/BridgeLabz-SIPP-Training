// EmployeeBonusCalculator.java
package JavaControlFlow;
import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary and years of service
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus: ₹" + bonus);
        } else {
            System.out.println("No bonus for service less than or equal to 5 years.");
        }

        sc.close();
    }
}

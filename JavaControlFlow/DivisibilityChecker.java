// DivisibilityChecker.java
package JavaControlFlow;
import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("The number " + number + " is divisible by 5.");
        } else {
            System.out.println("The number " + number + " is not divisible by 5.");
        }

        sc.close();
    }
}

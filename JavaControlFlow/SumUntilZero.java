// SumUntilZero.java
package JavaControlFlow;
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double input = sc.nextDouble();

            // Stop the loop if the input is 0
            if (input == 0) {
                break;
            }

            // Add input to total
            total += input;
        }

        System.out.println("The total sum is: " + total);
        sc.close();
    }
}

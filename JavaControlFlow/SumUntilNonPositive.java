// SumUntilNonPositive.java
package JavaControlFlow;
import java.util.Scanner;

public class SumUntilNonPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        // Loop until user enters 0 or negative number
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = sc.nextDouble();

            if (value <= 0) {
                break;
            }

            total += value;
        }

        System.out.println("Total sum is: " + total);
        sc.close();
    }
}

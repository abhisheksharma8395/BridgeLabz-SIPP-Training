// NaturalSumChecker.java

import java.util.Scanner;

public class NaturalSumChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the input is a natural number
        if (n > 0) {
            int sum = 0;

            // Calculate sum using for loop
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            // Calculate sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Display both results
            System.out.println("Sum using loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
        } else {
            System.out.println("The number is not a natural number.");
        }

        sc.close();
    }
}

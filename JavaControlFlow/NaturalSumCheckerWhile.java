// NaturalSumCheckerWhile.java

import java.util.Scanner;

public class NaturalSumCheckerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sum = 0;
            int i = 1;

            // Sum using while loop
            while (i <= n) {
                sum += i;
                i++;
            }

            // Sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Print both results
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
        } else {
            System.out.println("The number is not a natural number.");
        }

        sc.close();
    }
}

// ArmstrongNumberChecker.java
package JavaControlFlow;

import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int original = number;
        int sum = 0;

        // Calculate sum of cubes of digits
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        // Check Armstrong condition
        if (sum == original) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is Not an Armstrong Number.");
        }

        sc.close();
    }
}

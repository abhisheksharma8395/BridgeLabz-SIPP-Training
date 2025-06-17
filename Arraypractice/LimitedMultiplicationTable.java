package Arraypractice;

import java.util.Scanner;

public class LimitedMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number for multiplication table (6-9): ");
        int number = sc.nextInt();

        // Validate input range
        if (number < 6 || number > 9) {
            System.out.println("Number must be between 6 and 9.");
            return;
        }

        // Create and fill multiplication table
        int[] multiplicationResult = new int[4]; // For 6,7,8,9
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6);
        }

        // Display table
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
    }
}

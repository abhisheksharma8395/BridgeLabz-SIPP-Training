package Arraypractice;

import java.util.Scanner;

public class FrequncyOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Count digits
        int digitCount = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            digitCount++;
        }

        // Extract digits
        int[] digits = new int[digitCount];
        temp = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = (int) (temp % 10);
            temp /= 10;
        }

        // Calculate frequency of each digit (0-9)
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Display frequency
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
    }
}

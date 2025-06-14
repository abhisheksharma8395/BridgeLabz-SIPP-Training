// HarshadNumberChecker.java

import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int original = number;
        int sum = 0;

        // Calculate sum of digits
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        // Check if original number is divisible by sum of its digits
        if (original % sum == 0) {
            System.out.println(original + " is a Harshad Number.");
        } else {
            System.out.println(original + " is Not a Harshad Number.");
        }

        sc.close();
    }
}

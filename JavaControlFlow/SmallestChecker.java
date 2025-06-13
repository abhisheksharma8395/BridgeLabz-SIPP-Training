// SmallestChecker.java

import java.util.Scanner;

public class SmallestChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Check if first is the smallest
        if (num1 < num2 && num1 < num3) {
            System.out.println("Yes, the first number is the smallest.");
        } else {
            System.out.println("No, the first number is not the smallest.");
        }

        sc.close();
    }
}

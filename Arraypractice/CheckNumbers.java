package Arraypractice;
import java.util.Scanner;
public class CheckNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Classify numbers
        for (int number : numbers) {
            if (number > 0) {
                System.out.print(number + " is positive and ");
                System.out.println(number % 2 == 0 ? "even" : "odd");
            } else if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println(number + " is zero.");
            }
        }

        // Compare first and last elements
        System.out.print("First and last elements are ");
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("first is greater than last.");
        } else {
            System.out.println("first is less than last.");
        }

    }
}

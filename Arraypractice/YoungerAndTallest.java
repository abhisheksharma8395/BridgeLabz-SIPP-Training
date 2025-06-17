package Arraypractice;

import java.util.Scanner;

public class YoungerAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input age and height for each friend
        System.out.println("Enter age and height for 3 friends:");
        for (int i = 0; i < 3; i++) {
            System.out.print(friends[i] + "'s age: ");
            ages[i] = scanner.nextInt();
            System.out.print(friends[i] + "'s height (cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Find youngest
        int youngestAge = ages[0];
        String youngest = friends[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngest = friends[i];
            }
        }

        // Find tallest
        double tallestHeight = heights[0];
        String tallest = friends[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallest = friends[i];
            }
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Youngest friend: " + youngest + " (age " + youngestAge + ")");
        System.out.println("Tallest friend: " + tallest + " (height " + tallestHeight + "cm)");

    }
}

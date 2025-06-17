package Arraypractice;

import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        // Input heights for 11 players
        System.out.println("Enter heights of 11 football players (in meters):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        // Calculate and display mean height
        double mean = sum / heights.length;
        System.out.printf("Mean height of the team: %.2f meters\n", mean);
    }
}

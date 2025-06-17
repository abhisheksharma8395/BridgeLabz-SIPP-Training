package Arraypractice;

import java.util.Scanner;

public class BMICalculator2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of persons
        System.out.print("Enter number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // 2D array to store weight, height, BMI
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        // Input data for each person
        for (int i = 0; i < numberOfPersons; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("\nPerson " + (i + 1) + " weight (kg): ");
                personData[i][0] = scanner.nextDouble();
                System.out.print("Person " + (i + 1) + " height (m): ");
                personData[i][1] = scanner.nextDouble();

                if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                    System.out.println("Invalid input. Weight and height must be positive.");
                    i--; // Decrement index to re-enter data
                } else {
                    validInput = true;
                }
            }

            // Calculate BMI and store in array
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine status
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nBMI Results:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("Person %d: Height=%.2fm, Weight=%.2fkg, BMI=%.2f, Status=%s\n",
                    i + 1, personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

    }
}

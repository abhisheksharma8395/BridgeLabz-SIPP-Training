// BMICalculator.java

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input weight (in kg) and height (in cm)
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeters * heightMeters);

        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Classify BMI
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 24.9)
            System.out.println("Normal weight");
        else if (bmi < 39.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

        sc.close();
    }
}

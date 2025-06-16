package PracticeProblems;

import java.util.Scanner;
class CalculateAverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input for first number
        System.out.println("Enter first number:");
        double a = sc.nextDouble();

        // taking input for second number
        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        // taking input for third number
	    System.out.println("Enter third number:");
        double c = sc.nextDouble();

        //calculating result
	    double average = (a + b + c) / 3;
        System.out.println("Average of the three numbers is: " + average);
    }
}

package PracticeProblems;

import java.util.Scanner;
class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal:");
        double principal = sc.nextDouble();
        System.out.println("Enter Rate of Interest:");
        double rate = sc.nextDouble();
        System.out.println("Enter Time (in years):");
        double time = sc.nextDouble();
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: " + interest);
    }
}

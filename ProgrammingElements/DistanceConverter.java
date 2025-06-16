package ProgrammingElements;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Taking input from user 
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        //Calculating yards 
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;
        
        System.out.printf("The distance is %.2f feet, %.2f yards, or %.5f miles\n", distanceInFeet, yards, miles);
        
        scanner.close();
    }
}
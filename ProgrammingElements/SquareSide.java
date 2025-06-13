import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Taking Input from User
        System.out.print("Enter perimeter: ");
        double perimeter = scanner.nextDouble();
        //Calculating Sides
        double side = perimeter / 4;
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);
        
        scanner.close();
    }
}
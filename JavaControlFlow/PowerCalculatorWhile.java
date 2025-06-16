// PowerCalculatorWhile.java
package JavaControlFlow;
import java.util.Scanner;

public class PowerCalculatorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number and power
        System.out.print("Enter base number: ");
        int number = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        // Calculate power using while loop
        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println(number + " raised to the power " + power + " is: " + result);

        sc.close();
    }
}

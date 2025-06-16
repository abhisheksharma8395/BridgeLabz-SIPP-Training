// GreatestFactorFinder.java
package JavaControlFlow;
import java.util.Scanner;

public class GreatestFactorFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;
        int counter = number - 1;

        // Loop from number-1 to 1
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        sc.close();
    }
}

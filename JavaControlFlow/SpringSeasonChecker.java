// SpringSeasonChecker.java
package JavaControlFlow;
import java.util.Scanner;

public class SpringSeasonChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take month and day as input
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        // Check if it's between March 20 to June 20
        boolean isSpring = (month == 3 && day >= 20) ||
                           (month == 4) ||
                           (month == 5) ||
                           (month == 6 && day <= 20);

        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        sc.close();
    }
}

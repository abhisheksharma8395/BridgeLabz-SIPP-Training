// RocketCountdownFor.java
package JavaControlFlow;
import java.util.Scanner;

public class RocketCountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take countdown start value from user
        System.out.print("Enter countdown start number: ");
        int counter = sc.nextInt();

        // Loop from counter down to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Rocket Launched!");
        sc.close();
    }
}

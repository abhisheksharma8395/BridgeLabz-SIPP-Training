// RocketCountdownWhile.java
package JavaControlFlow;
import java.util.Scanner;

public class RocketCountdownWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input starting number for countdown
        System.out.print("Enter starting countdown number: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Rocket Launched!");
        sc.close();
    }
}

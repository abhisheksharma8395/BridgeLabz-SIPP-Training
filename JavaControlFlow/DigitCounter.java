// DigitCounter.java

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int count = 0;

        // Handle case when number is 0
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
        sc.close();
    }
}

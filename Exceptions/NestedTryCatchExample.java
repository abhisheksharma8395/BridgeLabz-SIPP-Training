package Exceptions;

import java.util.*;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30};
        int index = sc.nextInt();
        int divisor = sc.nextInt();
        try {
            try {
                int value = arr[index];
                System.out.println(value / divisor);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}

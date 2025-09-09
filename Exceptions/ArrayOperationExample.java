package Exceptions;

import java.util.*;

public class ArrayOperationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] arr = {10, 20, 30};
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}

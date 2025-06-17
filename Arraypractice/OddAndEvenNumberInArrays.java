package Arraypractice;

import java.util.Scanner;

public class OddAndEvenNumberInArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input for a number
        int number = sc.nextInt();
        if(number<1) System.out.println("error! Invalid number");
        int[] evenArray = new int[(number/2)+1];
        int [] oddArray = new int[(number/2)+1];
        int indexForOdd = 0;
        int indexForEven = 0;

        //Looping through numbers from 1 to the number
        for(int i = 1;i <= number;i++){
            if(i % 2 == 0){
                evenArray[indexForEven++] = i;
            }
            else{
                oddArray[indexForOdd++] = i;
            }
        }

        // print the odd numbers
        for(int i = 0;i<indexForOdd;i++){
            System.out.print(oddArray[i] + " ");
        }

        //for new line
        System.out.println(" ");

        //print the even numbers
        for(int i = 0;i<indexForEven;i++){
            System.out.print(evenArray[i] + " ");
        }
    }
}

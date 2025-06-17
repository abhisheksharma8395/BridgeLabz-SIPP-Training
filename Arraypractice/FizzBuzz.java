package Arraypractice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n+1];


        //Looping through array
        for(int i = 1;i < array.length;i++){
            if(i%3 == 0 &&  i%5 == 0){
                array[i] = "FizzBuzz";
            }
            else if(i%3 == 0){
                array[i] = "Fizz";
            }
            else if(i%5 == 0){
                array[i] = "Buzz";
            }
            else{
                array[i] = String.valueOf(i);
            }
        }

        //print the array
        for(int i = 1;i < array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}

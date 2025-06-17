package Arraypractice;

import java.util.Scanner;

public class CanCastVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array for storing 10 persons age
        int[] ages = new int[10];

        //Taking input for 10 ages
        for(int i = 0; i < 10; i++){
            ages[i] = sc.nextInt();
        }

        //Looping through array ages and prints the output
        for(int i = 0;i < ages.length;i++){
            if(ages[i] < 0){
                System.out.println("An Invalid age!");
            }
            else if(ages[i] >= 18){
                System.out.println("The student with the age "+ages[i]+" can vote");
            }
            else{
                System.out.println("The student with the age "+ages[i]+" cannot vote");
            }
        }

    }
}

package PracticeProblems;

import java.util.Scanner;
class AddTwoNumbers{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//Taking Input for first number
		System.out.println("Enter First Number");
		int a = sc.nextInt();

		//Taking Input for first number
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		
		//Calculating results
		int c = a+b;
		System.out.println("Addition of "+a+" And "+b+" is :"+c);
    }
}

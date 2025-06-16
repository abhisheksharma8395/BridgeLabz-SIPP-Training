package PracticeProblems;

import java.util.Scanner;
class CelsiusToFahrenheitConversion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celsius degree :");
        int celisusDegree = sc.nextInt();
        int FahrenheitDegree = (celisusDegree*(9/5))+32;
        System.out.println("Temperature is "+celisusDegree+" Fahrenheit degree");
    }
}

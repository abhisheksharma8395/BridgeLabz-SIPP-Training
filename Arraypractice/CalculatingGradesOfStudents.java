package Arraypractice;

import java.util.Scanner;

public class CalculatingGradesOfStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input of total number of students by user
        int totalStudents = sc.nextInt();
        int[][] marks = new int[totalStudents][3]; //Storing marks of physics,chemistry and maths for each student
        int[] percentages = new int[totalStudents]; //Stores percentage of each student
        char[] grades = new char[totalStudents]; // Stores grade of each student

        // taking input of marks for all student
        for (int i = 0; i < totalStudents; i++) {
            boolean flag = false;
            while (!flag) {
                System.out.println("Enter physics marks of student " + (i + 1));
                marks[i][0] = sc.nextInt();
                System.out.println("Enter chemistry marks of student " + (i + 1));
                marks[i][0] = sc.nextInt();
                System.out.println("Enter maths marks of student " + (i + 1));
                marks[i][0] = sc.nextInt();
                if(marks[i][0] >= 0 && marks[i][1] >= 0 && marks[i][2] >= 0) {
                    flag = true;
                }
                else{
                    System.out.println("Invalid input of marks marks cannot be negative");
                    i--;
                }
            }
        }

        // Calculating the percentage of students
        for(int i = 0; i < totalStudents; i++) {
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            if(percentages[i] >= 80) {
                grades[i] = 'A';
            }
            else if(percentages[i] >= 70) {
                grades[i] = 'B';
            }
            else if(percentages[i] >= 60) {
                grades[i] = 'C';
            }
            else if(percentages[i] >= 50) {
                grades[i] = 'D';
            }
            else if(percentages[i] >= 40) {
                grades[i] = 'E';
            }
            else{
                grades[i] = 'F';
            }
        }

        // Displaying the result
        for(int i = 0; i < totalStudents; i++) {
            System.out.println("Student " + (i + 1) + " marks in physics is "+marks[i][0]+" and marks in chemistry is "+marks[i][1]+" marks in maths is "+marks[i][2]+" and\n percentage is "+percentages[i]+" and grade is" + grades[i]);
        }
    }
}

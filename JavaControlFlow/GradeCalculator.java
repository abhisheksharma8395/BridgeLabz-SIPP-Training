// GradeCalculator.java

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for 3 subjects
        System.out.print("Enter Physics marks: ");
        double physics = sc.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter Maths marks: ");
        double maths = sc.nextDouble();

        // Compute average
        double average = (physics + chemistry + maths) / 3;

        // Determine grade
        if (average >= 80) {
            System.out.println("Average Marks is +"average" and Grade is: A and Remark is Level 4, above agency-nomalized standards");
        } else if (average >= 70) {
            System.out.println("Average Marks is +"average" and Grade is: B and Remark is Level 3, at agency-nomalized standards");
        } else if (average >= 60) {
            System.out.println("Average Marks is +"average" and Grade is: C and Remark is Level 2, but approaching agency-nomalized standards");
        } else if (average >= 50) {
            System.out.println("Average Marks is +"average" and Grade is: D and Remark is Level 1, well below agency-nomalized standards");
        } else if (average >= 40) {
            System.out.println("Average Marks is +"average" and Grade is: E and Remark is Level 1, too below agency-nomalized standards");
        } else {
            System.out.println("Average Marks is +"average" and Grade is: R and Remark is Remedial standards");
        }

        sc.close();
    }
}

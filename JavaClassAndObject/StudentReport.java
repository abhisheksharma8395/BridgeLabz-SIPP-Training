package JavaClassAndObject;

class Student {
    String name;
    int rollNumber;
    int marks;

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Grade: " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Rahul";
        student.rollNumber = 23;
        student.marks = 82;

        student.display(); // Display student grade
    }
}

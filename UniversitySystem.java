public class UniversitySystem {
    public static void main(String[] args) {
        // Create students
        Students s1 = new Undergraduate("Abhishek", 101);
        Students s2 = new Postgraduate("Priya", 201);

        // Create courses
        Course c1 = new Course("CS101", "Data Structures");
        Course c2 = new Course("ML201", "Machine Learning");

        // Create faculty
        Faculty prof = new Faculty("Dr. Verma");

        // Enroll students
        Enrollment e1 = new Enrollment(s1, c1);
        Enrollment e2 = new Enrollment(s2, c2);

        // Assign grades (polymorphic behavior)
        prof.assignGrade(e1, "A");
        prof.assignGrade(e2, "PASS");

        // View transcripts
        s1.printTranscript();
        s2.printTranscript();
    }
}
// Interface: Abstraction for grading logic
interface Graded {
    void assignGrade(Enrollment enrollment, String grade);
}

// Base Class: Student
class Students {
    private String name;
    private int id;
    private double totalGradePoints = 0;
    private int totalCourses = 0;

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void addGradePoints(double gradePoint) {
        totalGradePoints += gradePoint;
        totalCourses++;
    }

    public double getGPA() {
        return totalCourses == 0 ? 0.0 : totalGradePoints / totalCourses;
    }

    public void printTranscript() {
        System.out.println("Transcript for " + name + " (ID: " + id + ")");
        System.out.println("GPA: " + getGPA());
    }
}

// Inheritance: UG and PG extend Student
class Undergraduate extends Students {
    public Undergraduate(String name, int id) {
        super(name, id);
    }
}

class Postgraduate extends Students {
    public Postgraduate(String name, int id) {
        super(name, id);
    }
}

// Course class
class Course {
    private String code;
    private String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }
}

// Enrollment class: links Student and Course
class Enrollment {
    private Students student;
    private Course course;
    private String grade;

    public Enrollment(Students student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Students getStudent() {
        return student;
    }

    public String getGrade() {
        return grade;
    }

    public Course getCourse() {
        return course;
    }
}

// Faculty class implements Graded
class Faculty implements Graded {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    // Polymorphic assignGrade method (supports letter grading and pass/fail)
    @Override
    public void assignGrade(Enrollment enrollment, String grade) {
        enrollment.setGrade(grade);
        double points;

        // Example: Pass/Fail or Letter grading support
        switch (grade.toUpperCase()) {
            case "A": points = 4.0; break;
            case "B": points = 3.0; break;
            case "C": points = 2.0; break;
            case "D": points = 1.0; break;
            case "F": points = 0.0; break;
            case "PASS": points = 3.5; break;
            case "FAIL": points = 0.0; break;
            default:
                System.out.println("Invalid grade format");
                return;
        }

        enrollment.getStudent().addGradePoints(points);
        System.out.println("Faculty " + name + " assigned grade " + grade +
                " to " + enrollment.getStudent().getClass().getSimpleName() +
                " for course " + enrollment.getCourse().getTitle());
    }
}

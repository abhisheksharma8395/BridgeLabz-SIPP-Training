import java.util.*;

class Student1 {
    private String id;
    private String name;
    private int age;
    private Set<String> subjects;
    private Map<String, Integer> grades; // subject → grade

    public Student1(String id, String name, int age, Set<String> subjects, Map<String, Integer> grades) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subjects = subjects;
        this.grades = grades;
    }

    // 📥 Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public Set<String> getSubjects() { return subjects; }
    public Map<String, Integer> getGrades() { return grades; }

    // 📊 Calculate average grade
    public double getAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        int sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return "👤 ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Subjects: " + subjects +
                ", Grades: " + grades +
                ", Avg: " + getAverageGrade();
    }
}

class StudentManagementSystem {
    private Map<String, Student1> students = new HashMap<>();

    // ➕ Add student
    public void addStudent(Student1 student) {
        students.put(student.getId(), student);
        System.out.println("✅ Student added: " + student.getName());
    }

    // ➖ Remove student by ID
    public void removeStudent(String id) {
        Student1 removed = students.remove(id);
        if (removed != null) {
            System.out.println("🗑️ Removed student: " + removed.getName());
        } else {
            System.out.println("❌ Student not found with ID: " + id);
        }
    }

    // 🔍 Search by ID
    public void searchById(String id) {
        Student1 student = students.get(id);
        if (student != null) {
            System.out.println("🔍 Found: " + student);
        } else {
            System.out.println("❌ No student found with ID: " + id);
        }
    }

    // 🔍 Search by Name
    public void searchByName(String name) {
        boolean found = false;
        for (Student1 s : students.values()) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("🔍 Found: " + s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("❌ No student found with name: " + name);
        }
    }

    // 📋 List all students
    public void listAllStudents() {
        if (students.isEmpty()) {
            System.out.println("📭 No student records found.");
        } else {
            System.out.println("📄 All Students:");
            for (Student1 s : students.values()) {
                System.out.println(s);
            }
        }
    }

    // 🧮 Sort by Name
    public void sortByName() {
        List<Student1> list = new ArrayList<>(students.values());
        list.sort(Comparator.comparing(Student1::getName));
        System.out.println("📚 Students Sorted by Name:");
        for (Student1 s : list) System.out.println(s);
    }

    // 🧠 Sort by Average Grade
    public void sortByAverageGrade() {
        List<Student1> list = new ArrayList<>(students.values());
        list.sort(Comparator.comparingDouble(Student1::getAverageGrade).reversed());
        System.out.println("📈 Students Sorted by Average Grade:");
        for (Student1 s : list) System.out.println(s);
    }

    // 🔎 Find students by subject
    public void findStudentsBySubject(String subject) {
        boolean found = false;
        System.out.println("📘 Students enrolled in subject: " + subject);
        for (Student1 s : students.values()) {
            if (s.getSubjects().contains(subject)) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("❌ No students found for subject: " + subject);
        }
    }
}

// 🚀 Main class to test the system
public class StudentManagementSystemApp {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();

        // Sample students
        Set<String> subs1 = new HashSet<>(Arrays.asList("Math", "Science"));
        Map<String, Integer> grades1 = new HashMap<>();
        grades1.put("Math", 90);
        grades1.put("Science", 85);
        Student1 s1 = new Student1("S101", "Alice", 20, subs1, grades1);

        Set<String> subs2 = new HashSet<>(Arrays.asList("Math", "English"));
        Map<String, Integer> grades2 = new HashMap<>();
        grades2.put("Math", 70);
        grades2.put("English", 80);
        Student1 s2 = new Student1("S102", "Bob", 21, subs2, grades2);

        Set<String> subs3 = new HashSet<>(Arrays.asList("Science", "English"));
        Map<String, Integer> grades3 = new HashMap<>();
        grades3.put("Science", 95);
        grades3.put("English", 90);
        Student1 s3 = new Student1("S103", "Charlie", 19, subs3, grades3);

        // Operations
        sms.addStudent(s1);
        sms.addStudent(s2);
        sms.addStudent(s3);
        System.out.println();

        sms.listAllStudents();
        System.out.println();

        sms.searchById("S102");
        sms.searchByName("Charlie");
        System.out.println();

        sms.sortByName();
        System.out.println();

        sms.sortByAverageGrade();
        System.out.println();

        sms.findStudentsBySubject("Math");
        sms.findStudentsBySubject("History");
        System.out.println();

        sms.removeStudent("S101");
        sms.listAllStudents();
    }
}

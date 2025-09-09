import java.util.*;

public class StudentMarksReport {

    // 🧠 Map to store student names and their list of marks
    private Map<String, List<Integer>> studentMarksMap = new HashMap<>();

    // ➕ Add marks for a student
    public void addMarks(String studentName, int mark) {
        studentMarksMap.putIfAbsent(studentName, new ArrayList<>());
        studentMarksMap.get(studentName).add(mark);
        System.out.println("✅ Added mark " + mark + " for " + studentName);
    }

    // 📊 Calculate average marks of a student
    public double calculateAverage(String studentName) {
        List<Integer> marks = studentMarksMap.get(studentName);
        if (marks == null || marks.isEmpty()) {
            System.out.println("⚠️ No marks found for " + studentName);
            return 0.0;
        }
        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }

    // 🥇 Find the top-performing student (based on average marks)
    public String getTopStudent() {
        String topStudent = null;
        double highestAvg = 0;

        for (Map.Entry<String, List<Integer>> entry : studentMarksMap.entrySet()) {
            double avg = calculateAverage(entry.getKey());
            if (avg > highestAvg) {
                highestAvg = avg;
                topStudent = entry.getKey();
            }
        }

        return topStudent;
    }

    // 📋 Display report for all students
    public void showReport() {
        if (studentMarksMap.isEmpty()) {
            System.out.println("📭 No student data available.");
            return;
        }

        System.out.println("\n📄 Student Marks Report:");
        for (Map.Entry<String, List<Integer>> entry : studentMarksMap.entrySet()) {
            String student = entry.getKey();
            List<Integer> marks = entry.getValue();
            double avg = calculateAverage(student);
            System.out.println("👤 " + student + " -> Marks: " + marks + ", Average: " + avg);
        }
    }

    // 🚀 Main method to test the system
    public static void main(String[] args) {
        StudentMarksReport report = new StudentMarksReport();

        report.addMarks("Alice", 85);
        report.addMarks("Alice", 90);
        report.addMarks("Bob", 78);
        report.addMarks("Bob", 88);
        report.addMarks("Charlie", 95);
        report.addMarks("Charlie", 92);
        report.addMarks("Charlie", 97);

        report.showReport();

        System.out.println("\n🏆 Top-performing student: " + report.getTopStudent());
    }
}

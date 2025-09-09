import java.util.*;

// 🎚️ Difficulty Enum
enum Difficulty {
    EASY, MEDIUM, HARD
}

// ❓ Generic Question Class
class Question<T> {
    private String questionText;
    private Difficulty difficulty;
    private Map<String, T> options;
    private T correctAnswer;

    public Question(String questionText, Difficulty difficulty, Map<String, T> options, T correctAnswer) {
        this.questionText = questionText;
        this.difficulty = difficulty;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public Map<String, T> getOptions() {
        return options;
    }

    public T getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public String toString() {
        return questionText + "\nOptions: " + options;
    }
}

// 📚 Subject class
class Subject<T> {
    private String name;
    private List<Question<T>> questions;

    public Subject(String name) {
        this.name = name;
        this.questions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Question<T>> getQuestions() {
        return questions;
    }

    public void addQuestion(Question<T> q) {
        questions.add(q);
    }
}

// 🧑‍🎓 Student class
class Student12 {
    private String name;
    private String rollNumber;

    public Student12(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber='" + rollNumber + "'}";
    }
}

// 📥 Answer class
class Answer<T> {
    private Question<T> question;
    private T submittedAnswer;

    public Answer(Question<T> question, T submittedAnswer) {
        this.question = question;
        this.submittedAnswer = submittedAnswer;
    }

    public boolean isCorrect() {
        return question.getCorrectAnswer().equals(submittedAnswer);
    }

    public Question<T> getQuestion() {
        return question;
    }

    public T getSubmittedAnswer() {
        return submittedAnswer;
    }
}

// 🧠 ExamSystem utility
class ExamSystem<T> {
    private Subject<T> subject;
    private List<Answer<T>> submittedAnswers = new ArrayList<>();

    public ExamSystem(Subject<T> subject) {
        this.subject = subject;
    }

    public void conductExam(Scanner scanner) {
        System.out.println("📘 Starting exam for subject: " + subject.getName());
        for (Question<T> q : subject.getQuestions()) {
            System.out.println("\n❓ " + q.getQuestionText());
            for (Map.Entry<String, T> opt : q.getOptions().entrySet()) {
                System.out.println(opt.getKey() + ": " + opt.getValue());
            }

            System.out.print("Enter your answer (e.g., A, B): ");
            String choice = scanner.next().toUpperCase();

            T selectedAnswer = q.getOptions().get(choice);
            if (selectedAnswer == null) {
                System.out.println("⚠️ Invalid option. Answer not recorded.");
                continue;
            }

            submittedAnswers.add(new Answer<>(q, selectedAnswer));
        }
    }

    public void showResult() {
        int correct = 0;
        for (Answer<T> ans : submittedAnswers) {
            if (ans.isCorrect()) correct++;
        }

        System.out.println("\n✅ Exam Completed!");
        System.out.println("📊 Total Questions: " + subject.getQuestions().size());
        System.out.println("✔️ Correct Answers: " + correct);
        System.out.println("❌ Incorrect Answers: " + (subject.getQuestions().size() - correct));
        System.out.println("🎯 Score: " + (correct * 10) + " / " + (subject.getQuestions().size() * 10));
    }
}

// 🚀 Main class
public class OnlineExamSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 🎯 Sample subject: Java
        Subject<String> java = new Subject<>("Java");

        Map<String, String> q1Options = new HashMap<>();
        q1Options.put("A", "Inheritance");
        q1Options.put("B", "Compilation");
        q1Options.put("C", "Encapsulation");
        q1Options.put("D", "Abstraction");
        java.addQuestion(new Question<>("Which OOP concept hides data?", Difficulty.EASY, q1Options, "C"));

        Map<String, String> q2Options = new HashMap<>();
        q2Options.put("A", "public");
        q2Options.put("B", "static");
        q2Options.put("C", "private");
        q2Options.put("D", "protected");
        java.addQuestion(new Question<>("Which keyword is used for data hiding?", Difficulty.MEDIUM, q2Options, "C"));

        // 🧑‍🎓 Create student
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your roll number: ");
        String roll = scanner.nextLine();
        Student12 student = new Student12(name, roll);

        // 🖊️ Take the exam
        ExamSystem<String> javaExam = new ExamSystem<>(java);
        javaExam.conductExam(scanner);
        javaExam.showResult();

        scanner.close();
    }
}

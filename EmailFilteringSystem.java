import java.util.*;
import java.util.regex.*;

// ⚠️ Unchecked exception for invalid email format
class InvalidEmailFormatException extends RuntimeException {
    public InvalidEmailFormatException(String message) {
        super(message);
    }
}

// ⚠️ Checked exception for domain search failure
class NoEmployeeFoundException extends Exception {
    public NoEmployeeFoundException(String message) {
        super(message);
    }
}

// 📧 Email class with validation
class Email {
    private String emailAddress;

    public Email(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    // ✅ Validate using regex
    public boolean isValid() {
        String regex = "^[a-z0-9._]+@company\\.com$";
        return Pattern.matches(regex, emailAddress);
    }
}

// 👤 Employee class
class Employee {
    private String name;
    private Email email;

    public Employee(String name, Email email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public Email getEmail() { return email; }

    public void setName(String name) { this.name = name; }
    public void setEmail(Email email) { this.email = email; }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', email='" + email.getEmailAddress() + "'}";
    }
}

// 🧰 EmailManager utility class
class EmailManager {
    private List<Employee> employeeList = new ArrayList<>();

    // ➕ Add employee after email validation
    public void addEmployee(String name, String emailStr) {
        try {
            Email email = new Email(emailStr);
            if (!email.isValid()) {
                throw new InvalidEmailFormatException("Invalid email format: " + emailStr);
            }
            Employee emp = new Employee(name, email);
            employeeList.add(emp);
            System.out.println("✅ Employee added: " + emp);
        } catch (InvalidEmailFormatException e) {
            System.err.println("❌ Error adding employee: " + e.getMessage());
        }
    }

    // 🔍 Search employees by domain
    public List<Employee> searchByDomain(String domain) throws NoEmployeeFoundException {
        List<Employee> matched = new ArrayList<>();
        for (Employee emp : employeeList) {
            if (emp.getEmail().getEmailAddress().contains(domain)) {
                matched.add(emp);
            }
        }

        if (matched.isEmpty()) {
            throw new NoEmployeeFoundException("No employees found with domain: " + domain);
        }

        return matched;
    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}

// 🚀 Main class to test the system
public class EmailFilteringSystem {
    public static void main(String[] args) {
        EmailManager manager = new EmailManager();

        // 🧪 Add employees - some valid, some invalid
        manager.addEmployee("Alice", "alice123@company.com");     // ✅
        manager.addEmployee("Bob", "bob.smith@company.com");      // ✅
        manager.addEmployee("Charlie", "charlie@other.com");      // ❌
        manager.addEmployee("Dave", "dave@company");              // ❌
        manager.addEmployee("Eve", "eve_99@company.com");         // ✅
        manager.addEmployee("Frank", "Frank99@company.com");      // ❌ uppercase not allowed

        System.out.println("\n📋 All Valid Employees:");
        for (Employee emp : manager.getAllEmployees()) {
            System.out.println(emp);
        }

        // 🔍 Search by domain
        try {
            System.out.println("\n🔍 Searching for domain: company.com");
            List<Employee> result = manager.searchByDomain("company.com");
            for (Employee emp : result) {
                System.out.println("✅ Found: " + emp);
            }
        } catch (NoEmployeeFoundException e) {
            System.err.println("⚠️ " + e.getMessage());
        }

        try {
            System.out.println("\n🔍 Searching for domain: other.com");
            List<Employee> result = manager.searchByDomain("other.com");
            for (Employee emp : result) {
                System.out.println("✅ Found: " + emp);
            }
        } catch (NoEmployeeFoundException e) {
            System.err.println("⚠️ " + e.getMessage());
        }
    }
}

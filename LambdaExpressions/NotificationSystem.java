package LambdaExpressions;

import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Patient heart rate abnormal!"),
            new Alert("Reminder", "Checkup scheduled at 5 PM."),
            new Alert("Info", "Cafeteria menu updated."),
            new Alert("Critical", "Blood pressure rising!")
        );

        
        Predicate<Alert> criticalFilter = alert -> alert.type.equals("Critical");

        
        alerts.stream()
              .filter(criticalFilter)
              .forEach(System.out::println);
    }
}

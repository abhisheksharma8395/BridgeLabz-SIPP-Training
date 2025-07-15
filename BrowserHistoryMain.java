// Base Navigation class for reuse (Polymorphism + Inheritance)
abstract class Navigation {
    public abstract void visit(String page);
    public abstract void back();
    public abstract void forward();
    public abstract String getCurrentPage();
}

// Doubly Linked List Node for History
class HistoryNode {
    String url;
    HistoryNode prev;
    HistoryNode next;

    public HistoryNode(String url) {
        this.url = url;
    }
}

// BrowserHistory class: Encapsulation + Abstraction + Inheritance
class BrowserHistory extends Navigation {
    private HistoryNode current;

    @Override
    public void visit(String page) {
        HistoryNode newNode = new HistoryNode(page);
        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;
        System.out.println("Visited: " + page);
    }

    @Override
    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Moved back to: " + current.url);
        } else {
            System.out.println("No previous page.");
        }
    }

    @Override
    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Moved forward to: " + current.url);
        } else {
            System.out.println("No forward page.");
        }
    }

    @Override
    public String getCurrentPage() {
        return current != null ? current.url : "No page visited yet.";
    }
}

public class BrowserHistoryMain {
    public static void main(String[] args) {
        Navigation history = new BrowserHistory(); // Polymorphic usage

        history.visit("google.com");
        history.visit("github.com");
        history.visit("stackoverflow.com");

        history.back();  // github.com
        history.back();  // google.com
        history.forward(); // github.com

        System.out.println("Current Page: " + history.getCurrentPage());
    }
}

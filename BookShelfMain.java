import java.util.*;

// Book class represents a single book
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Used for HashSet to prevent duplicates
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book b = (Book) obj;
        return title.equalsIgnoreCase(b.title) && author.equalsIgnoreCase(b.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title.toLowerCase(), author.toLowerCase());
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}

// BookShelf class: manages catalog by genre
class BookShelf {
    private Map<String, LinkedList<Book>> genreCatalog;
    private Set<Book> allBooks; // to avoid duplication

    public BookShelf() {
        genreCatalog = new HashMap<>();
        allBooks = new HashSet<>();
    }

    // Add book to a genre
    public void addBook(String genre, Book book) {
        if (allBooks.contains(book)) {
            System.out.println("❌ Book already exists: " + book);
            return;
        }

        genreCatalog.putIfAbsent(genre, new LinkedList<>());
        genreCatalog.get(genre).add(book);
        allBooks.add(book);
        System.out.println("✅ Added: " + book + " to genre: " + genre);
    }

    // Borrow book (remove from genre list)
    public void borrowBook(String genre, Book book) {
        if (!genreCatalog.containsKey(genre)) {
            System.out.println("❌ Genre not found.");
            return;
        }

        if (genreCatalog.get(genre).remove(book)) {
            allBooks.remove(book);
            System.out.println("📚 Borrowed: " + book);
        } else {
            System.out.println("❌ Book not available to borrow: " + book);
        }
    }

    // Return book (re-add to catalog)
    public void returnBook(String genre, Book book) {
        addBook(genre, book); // re-use add logic
    }

    // Display all books by genre
    public void displayCatalog() {
        if (genreCatalog.isEmpty()) {
            System.out.println("📚 Library is empty.");
            return;
        }

        System.out.println("\n📚 Library Catalog:");
        for (String genre : genreCatalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book book : genreCatalog.get(genre)) {
                System.out.println("  - " + book);
            }
        }
    }
}

public class BookShelfMain {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();

        // Sample books
        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("The Alchemist", "Paulo Coelho");
        Book b4 = new Book("The Hobbit", "J.R.R. Tolkien"); // duplicate

        // Add books
        shelf.addBook("Fantasy", b1);
        shelf.addBook("Dystopian", b2);
        shelf.addBook("Philosophical", b3);
        shelf.addBook("Fantasy", b4); // duplicate

        // Display catalog
        shelf.displayCatalog();

        // Borrow a book
        shelf.borrowBook("Fantasy", b1);
        shelf.displayCatalog();

        // Return a book
        shelf.returnBook("Fantasy", b1);
        shelf.displayCatalog();
    }
}

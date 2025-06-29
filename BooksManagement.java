import java.util.ArrayList;

public class BooksManagement {
    public static void main(String[] args) {

        //Creating Objects
        BookBuddy book1 = new BookBuddy();
        book1.addBook("To Kill a Mockingbird", "Harper Lee");

        BookBuddy book2 = new BookBuddy();
        book2.addBook("Malgudi Days", "A.k. Narayan");

        BookBuddy book3 = new BookBuddy();
        book3.addBook("The Great Gatsby", "F. Scott Fitzgerald");

        BookBuddy book4 = new BookBuddy();
        book4.addBook("Pride and Prejudice", "Jane Austen");

        BookBuddy book5 = new BookBuddy();
        book5.addBook("The Catcher in the Rye", "J.D. Salinger");

        BookBuddy book6 = new BookBuddy();
        book6.addBook("The Hobbit", "J.R.R. Tolkien");

        BookBuddy book7 = new BookBuddy();
        book7.addBook("Fahrenheit 451", "Ray Bradbury");

        BookBuddy book8 = new BookBuddy();
        book8.addBook("Jane Eyre", "Charlotte Brontë");

        BookBuddy book9 = new BookBuddy();
        book9.addBook("Animal Farm", "George Orwell");

        BookBuddy book10 = new BookBuddy();
        book10.addBook("The Lord of the Rings", "J.R.R. Tolkien");

        //Display book1 objects information
        book1.bookInfo();

        //For searching book by using Author name
        BookBuddy.SearchByAuthorName("George Orwell");
        BookBuddy.SearchByAuthorName("Chetan Bhagat");

        //Display list before Sorting
        System.out.println("Before Sorting");
        BookBuddy.displayList();

        //Display list after sorting
        BookBuddy.sortLexicographically();
    }
}
class BookBuddy{
    String AuthorName;            //Store Author name of book
    String title;                 // Store title of book
    static ArrayList<String[]> books = new ArrayList<>();
    String[] nameAndTitle = new String[2];

    //Constructor for Initialize objects
    public BookBuddy(){
        books.add(nameAndTitle);
    }

    //methods for adding books
    void addBook(String title, String AuthorName){
        this.title = title;
        this.AuthorName = AuthorName;
        nameAndTitle[0] = title;
        nameAndTitle[1] = AuthorName;
    }

    //Search by author name method
    static void SearchByAuthorName(String authorName){
        for (String[] book : books) {
            if (book[1].equals(authorName)) {
                System.out.println(authorName + " is Author of the book Named " + book[0]);
                System.out.println("---------------------------------------------------------------");
                return;
            }
        }
        System.out.println("No book found of "+authorName);
        System.out.println("--------------------------------------------------------------------");
    }

    //Convert list to array
    String[][] listToArray(){
        String[][] array = new String[books.size()][2];
        for (int i = 0; i < books.size(); i++) {
            array[i][0] = books.get(i)[0];
            array[i][1] = books.get(i)[1];
        }
        return array;
    }

    //Display details of Book
    void bookInfo(){
        System.out.println("Book Details :");
        System.out.println("Book Title : "+this.title);
        System.out.println("Author Name : "+this.AuthorName);
        System.out.println("--------------------------------------------------");
    }

    //Display all books details in list
    static void displayList(){
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i)[0]+" -> "+books.get(i)[1]);
        }
        System.out.println("--------------------------------------------------");
    }

    //For Sorting list on the basis of title
    static void sortLexicographically(){
        for (int i = 0; i < books.size()-1; i++) {
            for (int j = i+1; j < books.size(); j++) {
                if(books.get(i)[0].compareTo(books.get(j)[0])>0){
                    String temp = books.get(i)[0];
                    books.get(i)[0] = books.get(j)[0];
                    books.get(j)[0] = temp;
                }
            }
        }
        //print list after sorting
        System.out.println("After Sorting");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i)[0]+" -> "+books.get(i)[1]);
        }
        System.out.println("__________________________________________________________");
    }
}

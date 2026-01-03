import java.util.ArrayList;
import java.util.Comparator;

public class Library {

    private String libraryName;
    private String address;
    private ArrayList<Book> books = new ArrayList<>();

    public Library(String libraryName, String address) {
        this.libraryName = libraryName;
        this.address = address;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
            }
        }
    }

    public void sortBooksByYear() {
        books.sort(Comparator.comparingInt(Book::getYear));
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayInfo() {
        System.out.println("Library: " + libraryName + ", Address: " + address);
    }
}
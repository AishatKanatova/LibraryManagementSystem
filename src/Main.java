import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Library library = new Library("Central Library", "Kabanbay Batyr 60");


        library.addBook(new Book("Abai Zholy", "Mukhtar Auezov", 1942));
        library.addBook(new Book("Ulpan", "Gabit Musrepov", 1974));
        library.addBook(new Book("Harry Potter", "J.K. Rowling", 1997));


        LibraryMember member = new LibraryMember("Aishat", 77);


        library.displayInfo();
        System.out.println(member);
        System.out.println("Role: " + member.getRole());


        System.out.print("Enter book title to search: ");
        String title = scanner.nextLine();

        Book found = library.searchByTitle(title);

        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Book not found");
        }

        System.out.println("\nBooks sorted by year:");
        library.sortBooksByYear();
        library.displayBooks();

        scanner.close();
    }
}
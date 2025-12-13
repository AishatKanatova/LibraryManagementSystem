public class Main {
    public static void main(String[] args){
        Library library= new Library("Central Library", "Kabanbay Batyr 60");

        Book book1= new Book("Abai Zholy", "Mukhtar Auezov", 1942);
        Book book2= new Book("Ulpan", "Gabit Musrepov", 1974);

        LibraryMember member=new LibraryMember("Aishat", 77);

        library.displayInfo();
        book1.displayInfo();
        book2.displayInfo();
        member.displayInfo();

        if(book1.getTitle().equals(book2.getTitle())&&
                book1.getAuthor().equals(book2.getAuthor())) {
            System.out.println("The books are the same");
        } else {
            System.out.println("The books are different");
        }
    }

}
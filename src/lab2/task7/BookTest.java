package lab2.task7;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("J.K. Rowling",
                "Harry Potter and the Philosopher's Stone",
                1997);
        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getYearOfPublishing());
        book.setName("Harry Potter and the Chamber of Secrets");
        book.setYearOfPublishing(1998);
        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getYearOfPublishing());

        BookShelf bookShelf = new BookShelf();

        bookShelf.addBook(book);
        bookShelf.addBook(new Book("Jane Dou", "Physics#1", 2003));
        bookShelf.addBook(new Book("John Dou", "Mathematics#4", 1985));

        System.out.println("-".repeat(50));

        for(int i = 0; i < bookShelf.getBooks().size(); i++){
            System.out.println(bookShelf.getBooks().get(i).toString());
        }

        System.out.println("-".repeat(50));

        System.out.println("Earliest: " + bookShelf.earliestBook().toString());
        System.out.println("Latest: " + bookShelf.latestBook().toString());

        System.out.println("-".repeat(50));

        bookShelf.sortBooks();

        for(int i = 0; i < bookShelf.getBooks().size(); i++){
            System.out.println(bookShelf.getBooks().get(i).toString());
        }
    }
}

package lab2.task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookShelf {
    private ArrayList<Book> books = new ArrayList<>();
    private int booksAmount = 0;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        books.add(book);
        booksAmount += 1;
    }

    public Book earliestBook(){
        int minn = books.get(0).getYearOfPublishing();
        Book minBook = new Book();
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getYearOfPublishing() < minn){
                minn = books.get(i).getYearOfPublishing();
                minBook = books.get(i);
            }
        }
        return minBook;
    }

    public Book latestBook(){
        int maxx = books.get(0).getYearOfPublishing();
        Book maxBook = new Book();
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getYearOfPublishing() > maxx){
                maxx = books.get(i).getYearOfPublishing();
                maxBook = books.get(i);
            }
        }
        return maxBook;
    }


    public void sortBooks(){
        Comparator<Book> comparator = Comparator.comparing(Book::getYearOfPublishing);
        books.sort(comparator);
    }

}

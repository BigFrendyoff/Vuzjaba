package lab2.task7;

public class Book {
    private String author;
    private String name;
    private int yearOfPublishing;

    public Book(String author, String name, int yearOfPublishing) {
        this.author = author;
        this.name = name;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Book(){}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String toString(){
        return "Author: " + author + "; Book name: " + name + "; Year of publishing: " + yearOfPublishing;
    }
}

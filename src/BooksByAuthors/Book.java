package BooksByAuthors;

public class Book {

    public String nameOfBook;
    public int year;

    public Book(String nameOfBook, int year) {
        this.nameOfBook = nameOfBook;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", year=" + year +
                '}';
    }
}

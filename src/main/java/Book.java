public class Book {

    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
public String getGetBookTitle() {
        return this.title;
    }

    public String getGetBookAuthor() {
        return this.author;
    }

    public String getGetBookGenre() {
        return this.genre;
    }
}

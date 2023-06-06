import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("From Whom The Bell Tolls", "Ernest Hemingway", "Classics");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("From Whom The Bell Tolls", book.getGetBookTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Ernest Hemingway", book.getGetBookAuthor());
    }
    @Test
    public void bookHasGenre() {
        assertEquals("Classics", book.getGetBookGenre());
    }

}

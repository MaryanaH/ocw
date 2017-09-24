import com.mvelyka.library.Book;
import com.mvelyka.library.Library;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book[] books;

    @Test
    public void borrowBookTrueTest() {
        books = new Book[1];
        library = new Library(books);

        books[0] = new Book("Book1", "Author1", true);
        library.borrowBook(books[0].getName());

        assertEquals(books[0].isAvailable(), false);

    }

    @Test
    public void borrowBookFalseTest() {
        books = new Book[1];
        library = new Library(books);

        books[0] = new Book("Book1", "Author1", false);
        library.borrowBook(books[0].getName());

        assertEquals(books[0].isAvailable(), false);

    }

    @Test
    public void returnBookTrueTest() {
        books = new Book[1];
        library = new Library(books);

        books[0] = new Book("Book1", "Author1", false);
        library.returnBook(books[0].getName());

        assertEquals(books[0].isAvailable(), true);

    }

    @Test
    public void returnBookFalseTest() {
        books = new Book[1];
        library = new Library(books);

        books[0] = new Book("Book1", "Author1", true);
        library.returnBook(books[0].getName());

        assertEquals(books[0].isAvailable(), true);

    }

}

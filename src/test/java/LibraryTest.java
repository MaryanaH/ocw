import com.mvelyka.library.Book;
import com.mvelyka.library.Library;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book[] books;

    @Test
    public void borrowAvailableBookTest() {
        books = new Book[1];
        library = new Library(books);

        books[0] = new Book("Book1", "Author1", true);
        library.borrowBook(books[0].getName());

        assertEquals(books[0].isAvailable(), false);

    }

    @Test(expected = IllegalArgumentException.class)
    public void borrowNotAvailableBookTest() {
        books = new Book[1];
        library = new Library(books);

        books[0] = new Book("Book1", "Author1", false);
        library.borrowBook(books[0].getName());

    }

    @Test
    public void returnMissingBookTest() {
        books = new Book[1];
        library = new Library(books);

        books[0] = new Book("Book1", "Author1", false);
        library.returnBook(books[0].getName());

        assertEquals(books[0].isAvailable(), true);

    }

    @Test
    public void returnAvailableBookTest() {
        books = new Book[1];
        library = new Library(books);

        books[0] = new Book("Book1", "Author1", true);
        library.returnBook(books[0].getName());

        assertEquals(books[0].isAvailable(), true);

    }

    @Test(expected = IllegalArgumentException.class)
    public void returnNonExistingBook(){
        books = new Book[1];
        library = new Library(books);

        books[0] = new Book("Book1", "Author1", true);
        library.returnBook("NonExisting book");

    }

    @Test(expected = IllegalArgumentException.class)
    public void borrowNonExistingBook(){
        books = new Book[1];
        library = new Library(books);

        books[0] = new Book("Book1", "Author1", true);
        library.borrowBook("NonExisting book");

    }

}

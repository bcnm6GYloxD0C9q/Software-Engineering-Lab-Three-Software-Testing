import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BookManagerTest {

    @Test
    public void testAddBookSuccess() {
        BookManager bookManager = new BookManager();
        assertTrue(bookManager.addBook("Effective Java"));
    }

    @Test
    public void testAddBookFailure() {
        BookManager bookManager = new BookManager();
        assertFalse(bookManager.addBook(""));
    }

    @Test
    public void testRemoveBook() {
        BookManager bookManager = new BookManager();
        assertTrue(bookManager.removeBook("123"));
    }
}

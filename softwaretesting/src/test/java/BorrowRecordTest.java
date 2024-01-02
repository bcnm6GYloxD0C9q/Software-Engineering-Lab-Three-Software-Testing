import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Calendar;
import java.util.Date;

public class BorrowRecordTest {

    @Test
    public void testIsNotOverdue() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 10); // 10天后
        BorrowRecord record = new BorrowRecord("user1", "book1", new Date(), calendar.getTime());
        assertFalse(record.isOverdue());
    }

    @Test
    public void testIsOverdue() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -10); // 10天前
        BorrowRecord record = new BorrowRecord("user1", "book1", new Date(), calendar.getTime());
        assertTrue(record.isOverdue());
    }
}

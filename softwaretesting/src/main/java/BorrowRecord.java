import java.util.Date;

public class BorrowRecord {
    private String userId;
    private String bookId;
    private Date borrowDate;
    private Date returnDate;

    public BorrowRecord(String userId, String bookId, Date borrowDate, Date returnDate) {
        this.userId = userId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    // 省略getter和setter方法...

    public boolean isOverdue() {
        // 简化示例：假设如果returnDate在当前日期之前，则逾期
        return returnDate.before(new Date());
    }
}

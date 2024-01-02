public class BookManager {
    public boolean addBook(String title) {
        // 添加书籍的逻辑
        // 简化示例中，我们假设添加总是成功
        return title != null && !title.isEmpty();
    }

    public boolean removeBook(String bookId) {
        // 移除书籍的逻辑
        // 简化示例中，我们假设移除总是成功
        return bookId != null && !bookId.isEmpty();
    }
}

package entity;

public class BookBorrowDetailManagement {
    private Book book;
    private int quanity;

    public BookBorrowDetailManagement(Book book, int quanity) {
        this.book = book;
        this.quanity = quanity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public void showAmountOfBooksBorrow(){
        System.out.println("Sach: " + book.getNameBook());
        System.out.println("So luong sach: "+ this.getQuanity());
    }
}

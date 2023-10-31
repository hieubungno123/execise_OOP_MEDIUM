package entity;

public class BookBorrowManagement {
    private Reader reader;
    private BookBorrowDetailManagement[] bookBorrowDetailManagements;

    public BookBorrowManagement(Reader reader, BookBorrowDetailManagement[] bookBorrowDetailManagements) {
        this.reader = reader;
        this.bookBorrowDetailManagements = bookBorrowDetailManagements;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public BookBorrowDetailManagement[] getBookBorrowDetailManagements() {
        return bookBorrowDetailManagements;
    }

    public void setBookBorrowDetailManagements(BookBorrowDetailManagement[] bookBorrowDetailManagements) {
        this.bookBorrowDetailManagements = bookBorrowDetailManagements;
    }

    public void showBookBorrowManagement(){
        System.out.println("Tên reader: " + this.reader.getName());
        for (int i = 0; i < bookBorrowDetailManagements.length; i++) {
            System.out.println("Sách thứ "+(i+1)+"");
            if(bookBorrowDetailManagements[i]!=null){
                bookBorrowDetailManagements[i].showAmountOfBooksBorrow();
            }
        }
    }


}

package logicHandle;

import entity.Book;
import entity.BookBorrowDetailManagement;
import entity.BookBorrowManagement;
import entity.Reader;

import java.util.Scanner;

public class BookBorrowManagementLogic {
    private BookBorrowManagement[] bookBorrowManagements = new BookBorrowManagement[100];
   // private BookBorrowDetailManagement[] details = new BookBorrowDetailManagement[100];
    private BookLogic bookLogic;
    private ReaderLogic readerLogic;
    //private int count = 0;


    public BookBorrowManagementLogic(BookLogic bookLogic, ReaderLogic readerLogic) {
        this.bookLogic = bookLogic;
        this.readerLogic = readerLogic;
    }

    public BookBorrowManagement[] getBookBorrowManagements() {
        return bookBorrowManagements;
    }

    public void borrowBook(){
        System.out.print("Có bao nhiêu bạn cần mượn sách: ");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Bạn đọc thứ "+(i+1)+": ");
            Reader reader = inputReaderToBorrow();
            BookBorrowDetailManagement[] details = bookBorrowDetailManagements();

            BookBorrowManagement bookBorrowManagement = new BookBorrowManagement(reader,details);
            saveBookBorrow(bookBorrowManagement);
        }
    }

    private BookBorrowDetailManagement[] bookBorrowDetailManagements(){
        System.out.println("Bạn muốn muôn bao nhieu dau sach: ");
        int numberBooks;
        do {
            numberBooks = new Scanner(System.in).nextInt();
            if(numberBooks>0&&numberBooks<6) {
                break;
            }
            System.out.println("Bạn đã mượn quá só lượng. Vui lòng nhập lại: ");
        }while (true);

        BookBorrowDetailManagement[] details = new BookBorrowDetailManagement[numberBooks];
        int count = 0;
        for (int i = 0; i < numberBooks; i++) {
            System.out.println("Đầu sách thứ "+(i+1)+"");
            System.out.println("Nhập bookID: ");
            int otherBookID;
            Book book = null;
            do {
                otherBookID = new Scanner(System.in).nextInt();
                book = bookLogic.searchBookID(otherBookID);
                if(book==null){
                    System.out.println("Không tim thấy sách. Vui lòng nhập lại: ");
                }
            }while (book==null);


            System.out.println("Đầu sách "+ book.getNameBook()+" bạn muốn mượn bao nhiêu");
            int quanity;
            do {
                quanity = new Scanner(System.in).nextInt();
                if(quanity>0&&quanity<4){
                    break;
                }
                System.out.println("Bạn mượn quá số lương sách. Vui long nhập lại");
            }while (true);
            BookBorrowDetailManagement detail = new BookBorrowDetailManagement(book,quanity);
            details[count]=detail;
            count++;
        }
        return details;
    }

    public Reader inputReaderToBorrow() {
        System.out.print("Nhap readerID can tim: ");
        int readerID;
        Reader reader = null;
        boolean check;
        do {
            readerID = new Scanner(System.in).nextInt();
            reader = readerLogic.rearchReaderID(readerID);
            if (reader == null) {
                System.out.print("Khong tim thay nguoi doc. Vui long nhap lai readerID: ");
                check = false;
            }
        } while (reader == null);
        return reader;
    }

    public void saveBookBorrow(BookBorrowManagement bookBorrowManagement){
        for (int i = 0; i < this.bookBorrowManagements.length; i++) {
            if(bookBorrowManagements[i] == null){
                bookBorrowManagements[i] = bookBorrowManagement;
                break;
            }
        }
    }

    public void showAllReaderBorrowBooks(){
        for (int i = 0; i < bookBorrowManagements.length; i++) {
            if (bookBorrowManagements[i]!=null){
                bookBorrowManagements[i].showBookBorrowManagement();
            }
        }
    }

    public void
}

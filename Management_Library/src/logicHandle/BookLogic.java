package logicHandle;

import entity.Book;

import java.util.Scanner;

public class BookLogic {

    Book[] books = new Book[100];

    public Book[] getBooks() {
        return books;
    }

    public void inputBook(){
        System.out.print("Nhập số lượng dau sach moi: ");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("----- Nhap sach thu "+(i+1)+" --------");
            Book book = new Book();
            book.inputInfo();
            saveBook(book);
        }
    }

    public void saveBook(Book book){
        for (int i = 0; i < this.books.length; i++) {
            if(books[i]==null){
                books[i]=book;
                break;
            }
        }
    }

    public void printBook(){
        System.out.println("Danh sach cac dau sach");
        for (int i = 0; i < this.books.length; i++) {
            if(books[i]!=null){
                books[i].showBook();
                System.out.println();
            }
        }
    }

    public Book searchBookID(int otherBookID){
        for (int i = 0; i < books.length; i++) {
            if(books[i]!=null && books[i].getId()==otherBookID){
                return books[i];
            }
        }
        return null;
    }
}

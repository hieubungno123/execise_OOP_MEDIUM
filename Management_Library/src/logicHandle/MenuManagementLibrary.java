package logicHandle;

import entity.Book;

import java.util.Scanner;

public class MenuManagementLibrary {

    private final BookLogic bookLogic = new BookLogic();
    private final ReaderLogic readerLogic = new ReaderLogic();
    private final BookBorrowManagementLogic bookBorrowManagementLogic = new BookBorrowManagementLogic(bookLogic,readerLogic);

    public void run(){
        do {
            printMenu();
            int numberFunction = chooseFunction();
            System.out.println();
            switch (numberFunction){
                case 1 :
                    bookLogic.inputBook();
                    break;
                case 2 :
                    bookLogic.printBook();
                    break;
                case 3 :
                    readerLogic.inputReader();
                    break;
                case 4 :
                    readerLogic.printAllReader();
                    break;
                case 5 :
                    bookBorrowManagementLogic.borrowBook();
                    break;
                case 6 :
                    bookBorrowManagementLogic.showAllReaderBorrowBooks();
                    break;
                case 7 :
                    bookBorrowManagementLogic.
                    break;
                case 8 :
                    return;
            }
        }while (true);

    }

    public void printMenu(){
        System.out.println();
        System.out.println("--------MENU--------");
        System.out.println("1.Input new books");
        System.out.println("2.Print all books");
        System.out.println("3.Input new reader");
        System.out.println("4.Print all reader");
        System.out.println("5.Input readers borrow books");
        System.out.println("6.Print all readers borrow books");
        System.out.println("7.Search reader in books management list ");
        System.out.println("8.Break");
    }

    public int chooseFunction(){
        System.out.print("Please enter: ");
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if(choice>0 && choice<9){
                return choice;
            }else{
                System.out.print("Your choice arent incorrect. Please enter correctly: ");
            }
        }while (true);
    }
}

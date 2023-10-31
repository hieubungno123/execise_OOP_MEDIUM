package entity;

import statics.ReaderType;
import statics.Specialized;

import java.util.Scanner;

public class Book implements InputTable {
    private String author;
    private String nameBook;
    public static int AUTO_ID=10000;
    private int id;
    private int publishingYear;
    private Specialized specialized;

    public Book(){
        this.id=AUTO_ID;
        AUTO_ID++;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Specialized getSpecialized() {
        return specialized;
    }

    public void setSpecialized(Specialized specialized) {
        this.specialized = specialized;
    }

    @Override
    public void inputInfo() {
        System.out.print("Nhập tên đầu sách: ");
        this.setNameBook(new Scanner(System.in).nextLine());
        System.out.print("Nhập tên tác giả: ");
        this.setAuthor(new Scanner(System.in).nextLine());
        System.out.println("Chọn 1 trong chuyen nganh sau: ");
        System.out.println("1.Natural Science");
        System.out.println("2.Literature and Art");
        System.out.println("3.Telecommunication");
        System.out.println("4.Information Technology");
        System.out.print("Chọn ngành: ");
        int type = new Scanner(System.in).nextInt();
        switch (type){
            case 1:
                this.setSpecialized(specialized.NATURAL_SCIENCE);
                break;
            case 2:
                this.setSpecialized(specialized.LITERTURE_AND_ART);
                break;
            case 3:
                this.setSpecialized(specialized.TELECOMMUNICATION);
                break;
            case 4:
                this.setSpecialized(specialized.INFORMATION_TECHNOLOGY);
                break;
        }
        System.out.print("Nhập năm xuất bản: ");
        this.setPublishingYear(new Scanner(System.in).nextInt());
    }

    public void showBook(){
        System.out.println("Ten sach: "+ this.getNameBook());
        System.out.println("BookID: " + this.getId());
        System.out.println("Author: "+ this.getAuthor());
        System.out.println("Specialized: "+ this.getSpecialized());
        System.out.println("Publishing Year: " +this.getPublishingYear());
    }
}

package entity;

import statics.ReaderType;
import statics.Specialized;

import java.util.Scanner;

public class Reader extends People{
        public static int AUTO_ID=10000;
        private int id;
        private ReaderType readerType;

        public Reader(){
            this.id=AUTO_ID;
            AUTO_ID++;
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

    public ReaderType getReaderType() {
        return readerType;
    }

    public void setReaderType(ReaderType readerType) {
        this.readerType = readerType;
    }

    @Override
    public void inputInfo(){
        super.inputInfo();
        System.out.println("Chọn loại bạn đọc:");
        System.out.println("1.Sinh viên");
        System.out.println("2.Học viên cao học");
        System.out.println("3.Giao viên");
        System.out.print("Chọn mục: ");
        int type = new Scanner(System.in).nextInt();
        switch (type){
            case 1:
                this.setReaderType(readerType.STUDENT);
                break;
            case 2:
                this.setReaderType(readerType.TEACHER);
                break;
            case 3:
                this.setReaderType(readerType.UNGRADUATE_STUDENT);
                break;
        }
    }

    public void showReader(){
        System.out.println("Ten nguoi doc: " + this.getName());
        System.out.println("ID: "+ this.getId());
        System.out.println("Kieu ban doc: " + this.getReaderType());
        System.out.println("Dia chi: "+ this.getAddress());
        System.out.println("Phone number: " + this.getPhoneNumber());
        System.out.println();

    }
}

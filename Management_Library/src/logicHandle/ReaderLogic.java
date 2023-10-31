package logicHandle;

import entity.Reader;

import java.util.Scanner;

public class ReaderLogic {
    Reader[] readers = new Reader[100];

    public Reader[] getReaders() {
        return readers;
    }

    public void inputReader(){
        System.out.print("Nhap so luong bạn dọc: ");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("----- Nhap ban doc thu "+(i+1)+" --------");
            Reader reader = new Reader();
            reader.inputInfo();
            saveReader(reader);
        }
    }

    public void saveReader(Reader reader){
        for (int i = 0; i < this.readers.length; i++) {
            if(readers[i]==null){
                readers[i]= reader;
                break;
            }
        }
    }

    public void printAllReader(){
        System.out.println("Danh sach cac ban doc: ");
        for (int i = 0; i < this.readers.length; i++) {
            if(readers[i]!=null){
                readers[i].showReader();
                System.out.println();
            }
        }
    }

    public Reader rearchReaderID(int readerID){
        for (int i = 0; i < this.readers.length; i++) {
            if(readers[i]!=null && readers[i].getId()==readerID){
                return readers[i];
            }
        }
        return null;
    }
}

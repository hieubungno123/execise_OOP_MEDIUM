package entity;

import java.util.Scanner;

public class People implements InputTable {
    protected String name;
    protected String address;
    protected int phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void inputInfo() {
        System.out.print("Nhập tên: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Nhập sdt: ");
        this.setPhoneNumber(new Scanner(System.in).nextInt());
        System.out.print("Nhập địa chỉ: ");
        this.setAddress(new Scanner(System.in).nextLine());
    }

}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package entity;

import java.util.Scanner;

public class Worker extends Employee {
    private int level;
    public static int AUTO_ID = 10000;
    private int id;

    public Worker() {
        this.id = AUTO_ID++;
    }

    public int getLevel() {
        return this.level;
    }

    public int getId() {
        return this.id;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String toString() {
        return "Worker{, name='" + this.name + "', id=" + this.id + "'level=" + this.level + "', age=" + this.age + "', sex='" + this.sex + "', address='" + this.address + "'}";
    }

    public void inputInfo() {
        System.out.print("Nhập tên công nhân: ");
        this.setName((new Scanner(System.in)).nextLine());
        System.out.print("Nhập chức vụ bậc: ");
        this.setLevel((new Scanner(System.in)).nextInt());
        System.out.print("Nhập tuổi: ");
        this.setAge((new Scanner(System.in)).nextInt());
        System.out.print("Nhập giới tình: ");
        this.setSex((new Scanner(System.in)).nextLine());
        System.out.print("Nhập dịa chỉ: ");
        this.setAddress((new Scanner(System.in)).nextLine());
    }

    public void showWorker() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Level: " + this.level);
        System.out.println("Age: " + this.age);
        System.out.println("Sex: " + this.sex);
        System.out.println("Address: " + this.address);
    }
}

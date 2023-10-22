//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package entity;

import java.util.Scanner;
import statics.MajorType;

public class Engineer extends Employee {
    public static int AUTO_ID = 10000;
    private MajorType majorType;
    private int id;

    public Engineer() {
        this.id = AUTO_ID++;
    }

    public MajorType getMajorType() {
        return this.majorType;
    }

    public void setMajorType(MajorType majorType) {
        this.majorType = majorType;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return "Engineer{ name='" + this.name + "', id=" + this.id + "', majorType=" + this.majorType + "', age=" + this.age + "', sex='" + this.sex + "', address='" + this.address + "'}";
    }

    public void inputInfo() {
        System.out.print("Nhập tên kỹ sư: ");
        this.setName((new Scanner(System.in)).nextLine());
        System.out.println("Chọn 1 trong các ngành sau: ");
        System.out.println("1.Công nghệ thông tin");
        System.out.println("2.Kế toán");
        System.out.println("3.Viễn thông");
        System.out.println("4.Quản trị kinh doanh");
        System.out.print("Nhập ngành: ");
        int type = (new Scanner(System.in)).nextInt();
        MajorType var10001;
        switch (type) {
            case 1:
                var10001 = this.majorType;
                this.setMajorType(MajorType.INFORMATION_TECHNOLOGY);
            case 2:
                var10001 = this.majorType;
                this.setMajorType(MajorType.ACCOUNTING);
            case 3:
                var10001 = this.majorType;
                this.setMajorType(MajorType.TELECOMMUNICATION);
            case 4:
                var10001 = this.majorType;
                this.setMajorType(MajorType.BUSINESS_ADMINISTRATION);
            default:
                System.out.print("Nhâp tuổi: ");
                this.setAge((new Scanner(System.in)).nextInt());
                System.out.print("Nhập giới tình: ");
                this.setSex((new Scanner(System.in)).nextLine());
                System.out.print("Nhập địa chỉ: ");
                this.setAddress((new Scanner(System.in)).nextLine());
        }
    }

    public void showEnginner() {
        System.out.println("Id kỹ sư: " + this.id);
        System.out.println("Họ và tên: " + this.name);
        System.out.println("Ngành: " + this.majorType);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Gioi tinh: " + this.sex);
        System.out.println("Địa chỉ: " + this.address);
    }
}

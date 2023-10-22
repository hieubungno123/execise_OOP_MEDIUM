//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package entity;

import java.util.Scanner;
import statics.JobType;

public class Staff extends Engineer {
    public static int AUTO_ID = 10000;
    private JobType jobType;
    private int id;

    public Staff() {
        this.id = AUTO_ID++;
    }

    public JobType getJobType() {
        return this.jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return "Staff{ name='" + this.name + "', id=" + this.id + "', jobType=" + this.jobType + "', age=" + this.age + "', sex='" + this.sex + "', address='" + this.address + "'}";
    }

    public void inputInfo() {
        System.out.print("Nhập tên nhân viên: ");
        this.setName((new Scanner(System.in)).nextLine());
        System.out.println("Chọn 1 trong các công việc sau:");
        System.out.println("1. Lập trình viên");
        System.out.println("2. Sale");
        System.out.println("3. Thiết kế");
        System.out.println("4. Quản lý");
        System.out.print("Nhập cộng việc: ");
        int type = (new Scanner(System.in)).nextInt();
        JobType var10001;
        switch (type) {
            case 1:
                var10001 = this.jobType;
                this.setJobType(JobType.DEVELOPER);
            case 2:
                var10001 = this.jobType;
                this.setJobType(JobType.SALE);
            case 3:
                var10001 = this.jobType;
                this.setJobType(JobType.DESIGNER);
            case 4:
                var10001 = this.jobType;
                this.setJobType(JobType.MANAGER);
            default:
                System.out.print("Nhập tuổi: ");
                this.setAge((new Scanner(System.in)).nextInt());
                System.out.print("Nhập giới tình: ");
                this.setSex((new Scanner(System.in)).nextLine());
                System.out.print("Nhập địa chỉ");
                this.setAddress((new Scanner(System.in)).nextLine());
        }
    }

    public void showStaff() {
        System.out.println("ID: " + this.id);
        System.out.println("Tên nhân viên: " + this.name);
        System.out.println("Công việc: " + this.jobType);
        System.out.println("Tuổi " + this.age);
        System.out.println("Gioi tinh: " + this.sex);
        System.out.println("Địa chỉ: " + this.address);
    }
}

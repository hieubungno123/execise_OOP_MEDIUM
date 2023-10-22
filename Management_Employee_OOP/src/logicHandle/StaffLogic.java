//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package logicHandle;

import entity.Staff;
import java.util.Scanner;

public class StaffLogic {
    private Staff[] staffs = new Staff[100];

    public StaffLogic() {
    }

    public Staff[] getStaffs() {
        return this.staffs;
    }

    public void inputStaff() {
        System.out.println("Số nhân viên mới: ");
        int number = (new Scanner(System.in)).nextInt();

        for(int i = 0; i < number; ++i) {
            System.out.println("Nhân viên thứ " + (i + 1) + ": ");
            Staff staff = new Staff();
            staff.inputInfo();
            this.savaStaff(staff);
            System.out.println();
        }

    }

    public void savaStaff(Staff staff) {
        for(int i = 0; i < this.staffs.length; ++i) {
            if (this.staffs[i] == null) {
                this.staffs[i] = staff;
                break;
            }
        }

    }

    public void printStaff() {
        for(int i = 0; i < this.staffs.length; ++i) {
            if (this.staffs[i] != null) {
                System.out.println("Nhân viên thứ: " + (i + 1) + ": ");
                this.staffs[i].showStaff();
                System.out.println();
            }
        }

    }

    public void searchStaff() {
        System.out.print("Nhap idStaff can tim: ");
        int staffID = (new Scanner(System.in)).nextInt();

        for(int i = 0; i < this.staffs.length; ++i) {
            if (this.staffs[i] != null && this.staffs[i].getId() == staffID) {
                this.staffs[i].showStaff();
                return;
            }
        }

        System.out.println("Khong tim thay");
    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package logicHandle;

import entity.Engineer;
import java.util.Scanner;

public class EngineerLogic {
    private Engineer[] engineers = new Engineer[100];

    public EngineerLogic() {
    }

    public Engineer[] getEngineers() {
        return this.engineers;
    }

    public void inputEngineer() {
        System.out.print("Có bao nhiêu kỹ sư mới: ");
        int number = (new Scanner(System.in)).nextInt();

        for(int i = 0; i < number; ++i) {
            System.out.println("Kỹ sư thứ " + (i + 1) + " :");
            Engineer engineer = new Engineer();
            engineer.inputInfo();
            this.saveEngineer(engineer);
            System.out.println();
        }

    }

    public void saveEngineer(Engineer engineer) {
        for(int i = 0; i < this.engineers.length; ++i) {
            if (this.engineers[i] == null) {
                this.engineers[i] = engineer;
                break;
            }
        }

    }

    public void printEngineer() {
        for(int i = 0; i < this.engineers.length; ++i) {
            if (this.engineers[i] != null) {
                System.out.println("Người thứ " + (i + 1) + " :");
                this.engineers[i].showEnginner();
                System.out.println();
            }
        }

    }

    public void searchEngineer() {
        System.out.print("Nhap idEngineer can tim: ");
        int engineerID = (new Scanner(System.in)).nextInt();
        int i = 0;
        if (i < this.engineers.length) {
            if (this.engineers[i] != null && this.engineers[i].getId() == engineerID) {
                this.engineers[i].showEnginner();
            }

        } else {
            System.out.println("Khong tim thay");
        }
    }
}

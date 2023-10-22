//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package logicHandle;

import java.util.Scanner;

public class MenuManagementEmployee {
    private final EngineerLogic engineerLogic = new EngineerLogic();
    private final StaffLogic staffLogic = new StaffLogic();
    private final WorkerLogic workerLogic = new WorkerLogic();

    public MenuManagementEmployee() {
    }

    public void run() {
        while(true) {
            this.printMenu();
            int numberChoice = chooseFunction();
            int numberPersonChoice;
            switch (numberChoice) {
                case 1:
                    numberPersonChoice = choosePerson();
                    switch (numberPersonChoice) {
                        case 1:
                            this.engineerLogic.inputEngineer();
                            continue;
                        case 2:
                            this.workerLogic.inputWorker();
                            continue;
                        case 3:
                            this.staffLogic.inputStaff();
                        default:
                            continue;
                    }
                case 2:
                    numberPersonChoice = choosePerson();
                    switch (numberPersonChoice) {
                        case 1:
                            this.engineerLogic.searchEngineer();
                            continue;
                        case 2:
                            this.workerLogic.searchWorker();
                            continue;
                        case 3:
                            this.staffLogic.searchStaff();
                        default:
                            continue;
                    }
                case 3:
                    numberPersonChoice = choosePerson();
                    switch (numberPersonChoice) {
                        case 1:
                            this.engineerLogic.printEngineer();
                            continue;
                        case 2:
                            this.workerLogic.printWorker();
                            continue;
                        case 3:
                            this.staffLogic.printStaff();
                        default:
                            continue;
                    }
                case 4:
                    return;
            }
        }
    }

    public void printMenu() {
        System.out.println("------MENU------");
        System.out.println("1.Thêm cán bộ:");
        System.out.println("2.Tìm kiếm cán bộ");
        System.out.println("3.Hiện thị danh sách các cán bộ");
        System.out.println("4.Thoát khỏi chương trình");
    }

    public static int chooseFunction() {
        System.out.print("Vui lòng chọn mục: ");

        int numberChoice;
        do {
            numberChoice = (new Scanner(System.in)).nextInt();
        } while(numberChoice < 1 && numberChoice > 4);

        return numberChoice;
    }

    public static int choosePerson() {
        System.out.println("1. Kỹ sư");
        System.out.println("2. Công nhân");
        System.out.println("3. Nhân viên");
        System.out.print("Chọn cán bộ:");

        int numberPerson;
        do {
            numberPerson = (new Scanner(System.in)).nextInt();
        } while(numberPerson < 1 && numberPerson > 3);

        return numberPerson;
    }
}

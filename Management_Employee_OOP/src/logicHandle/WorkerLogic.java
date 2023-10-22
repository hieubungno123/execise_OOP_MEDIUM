//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package logicHandle;

import entity.Worker;
import java.util.Scanner;

public class WorkerLogic {
    private Worker[] workers = new Worker[100];

    public WorkerLogic() {
    }

    public Worker[] getWorkers() {
        return this.workers;
    }

    public void inputWorker() {
        System.out.print("Số công nhân mới: ");
        int number = (new Scanner(System.in)).nextInt();

        for(int i = 0; i < number; ++i) {
            System.out.println("Nhân viên thứ " + (i + 1) + ": ");
            Worker worker = new Worker();
            worker.inputInfo();
            this.saveWorker(worker);
            System.out.println();
        }

    }

    public void saveWorker(Worker worker) {
        for(int i = 0; i < this.workers.length; ++i) {
            if (this.workers[i] == null) {
                this.workers[i] = worker;
                break;
            }
        }

    }

    public void printWorker() {
        for(int i = 0; i < this.workers.length; ++i) {
            if (this.workers[i] != null) {
                System.out.println("Công nhân thứ: " + (i + 1) + ": ");
                this.workers[i].showWorker();
                System.out.println();
            }
        }

    }

    public void searchWorker() {
        System.out.print("Nhap idworker muon tim: ");
        int workerID = (new Scanner(System.in)).nextInt();
        int i = 0;
        if (i < this.workers.length) {
            if (this.workers[i] != null && this.workers[i].getId() == workerID) {
                this.workers[i].showWorker();
            }

        } else {
            System.out.println("Khong tim thay");
        }
    }
}

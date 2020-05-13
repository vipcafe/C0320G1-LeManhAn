package HuongDoiTuong.BaiTap.StopWatch;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    long startTime, endTime;

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    private void start() {
         setStartTime(new Date().getTime());
    }

    private void end() {
         setEndTime(new Date().getTime());
    }

    private void code(int add) {
        int j;
        for (int i = 0; i < add; i++) {
            System.out.println(i);
        }
    }

    private void getElapsedTime(int add) {
        start();
        code(add);
        end();
        long result = this.endTime - this.startTime;
        System.out.println("Thoi gian thuc hien la "+result+" MiliSecond");
    }

    public static void main(String[] args) {
        StopWatch x = new StopWatch();
        Scanner add = new Scanner(System.in);
        System.out.print("Nhap So lan chay vong lap : ");
        int add1 = add.nextInt();
        x.getElapsedTime(add1);
    }

}
package NgonNguLapTrinhTrongJava.ThucHanh.TinhLaiSuat;

import java.util.Scanner;

public class TinhLaiSuat {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập lãi suất : ");
        interset_rate = input.nextDouble();
        System.out.println("Nhập số tiền đầu tư: ");
        money = input.nextDouble();
        System.out.println("Nhập số tháng: ");
        month = input.nextInt();
        double total_interset = 0;
        double sum = 0;
        for (int i = 0; i < month; i++) {
            total_interset = (money/100)*interset_rate;
            System.out.println("Lãi suất của tháng  " +i +" :"+ total_interset);
            sum += total_interset;
            System.out.println("Tổng : "+sum);
        }
    }
}

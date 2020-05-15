package B1.NgonNguLapTrinhTrongJava.ThucHanh.TinhNamNhuan;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so nam muon tinh nam nhuan :");
        int year = input.nextInt();
        namNhuan(year);

    }

    public static void namNhuan(int year) {
        boolean check = true;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    check = false;
                }
            }
        } else {
            check = false;
        }
        if (check) {
            System.out.println(year + " La Nam nhuan");
        } else {
            System.out.println(year + " Ko phai La Nam nhuan");
        }
    }
}

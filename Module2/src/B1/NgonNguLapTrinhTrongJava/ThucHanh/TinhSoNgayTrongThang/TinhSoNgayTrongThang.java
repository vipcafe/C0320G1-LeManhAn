package B1.NgonNguLapTrinhTrongJava.ThucHanh.TinhSoNgayTrongThang;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so thang muon kiem tra : ");
        byte date = input.nextByte();
        dateTime(date);
    }

    public static void dateTime(byte mount) {
        if (mount > 13 || mount < 0) {
            System.out.println("Vui long Nhap Lai ");
        } else {
            switch (mount) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Thang Nay co 31 ngay");
                    break;
                case 2:
                    System.out.println("Thang nay co 28 ngay");
                    break;
                default:
                    System.out.println("Thang nay co 30 ngay");
            }
        }
    }

}

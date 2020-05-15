package B1.NgonNguLapTrinhTrongJava.ThucHanh.DienTichHinhChuNhat;

import java.util.Scanner;

public class rectangularArea {
    public static void main(String[] args) {
        double width;
        double height;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chieu Rong :");
        width = input.nextDouble();
        System.out.print("Nhap chieu Cao :");
        height = input.nextDouble();
        double erena = width * height;
        System.out.print("Dien tich = " + erena);
    }
}

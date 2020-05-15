package B1.NgonNguLapTrinhTrongJava.ThucHanh.TimGiaTriTrongMang;

import java.util.Scanner;

public class test {
        public static void main(String[] args) {
        float number1 ;
        float number2 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a :");
        number1 = input.nextFloat();
        System.out.println("Nhap b :");
        number2 = input.nextFloat();
        System.out.println("Nhap tong a+b :");
        float expectedAnswer = input.nextFloat();

        while (number1 + number2 != expectedAnswer) {
            System.out.print("Wrong	answer");
            System.out.println("\nNhap tong a+b :");
            expectedAnswer = input.nextInt();
        }
        System.out.println("\nYou	got	it!");
    }

}


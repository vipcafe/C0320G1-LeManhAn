package B1.NgonNguLapTrinhTrongJava.ThucHanh.SoThanhChu;

import com.sun.org.apache.xpath.internal.objects.XNumber;
import sun.awt.windows.WPrinterJob;

import javax.swing.*;
import java.util.Scanner;

public class SoThanhChu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so muon thanh chu : ");
        int number = input.nextInt();
        numberIntoWord(number);
    }

    public static void numberOne(int number) {
        switch (number) {
            case 0:
                System.out.print("Zero");
                break;
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
        }
    }

    public static void numberTwo(int number) {
        switch (number % 10) {
            case 0:
                System.out.println("ten");
                break;
            case 1:
                System.out.println("eleven");
                break;
            case 2:
                System.out.println("twelve");
                break;
            case 3:
                System.out.println("thirteen");
                break;
            case 4:
                System.out.println("fourteen");
                break;
            case 5:
                System.out.println("fifteen");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                numberOne(number % 10);
                System.out.print("teen");
                break;
        }
    }

    public static void numberTwo2(int number) {
        if (number >= 20 && number < 100) {
            if (number % 10 == 0) {
                switch (number / 10) {
                    case 2:
                        System.out.print("twenty");
                        break;
                    case 3:
                        System.out.print("thirty");
                        break;
                    case 4:
                        System.out.print("forty");
                        break;
                    case 5:
                        System.out.print("fifty");
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        numberOne(number / 10);
                        System.out.print("ty");
                        break;
                }
            }

        }

    }

    public static void numberTwo3(int number) {
        if (number % 10 != 0) {
            switch (number % 10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    numberTwo2(number-(number%10));
                    System.out.print("-");
                    numberOne(number % 10);
                    break;
            }
        }

    }
    public static void numberIntoWord(int number){
        if (number < 10 && number >= 0){
            numberOne(number);
        }
        if(number >=10 && number < 20){
            numberTwo(number);
        }
        if(number%10 == 0){
            numberTwo2(number);
        }
        if(number>=20 && number <100){
            numberTwo3(number);
        }
    }
}


package B1.NgonNguLapTrinhTrongJava.ThucHanh.KiemTraSoNguyenTo;

import java.util.Scanner;

public class isPrime {
    public static void isPrime() {
        int add;
        boolean a = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Vui long nhap so muon kiem tra : ");
        add = input.nextInt();
        if (add == 1){
            System.out.println(add + " Ko phai la so nguyen to");
            isPrime();
            return;
        }
        for (int i = 2; i < Math.sqrt(add); i++) {
            if (add % i == 0) {
                System.out.print(add + " Ko phai la so nguyen to");
                a = true;
                break;
            }
        }
        if (a == false) {
            System.out.print(add + " la so nguyen to");
        }
    }

    public static void main(String[] args) {
        isPrime();
    }

}


package B1.NgonNguLapTrinhTrongJava.BaiTap.HienThi20So;

import java.util.Scanner;

public class HienThi20So {
    public static boolean isPrime(int number) {
        boolean check = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                check = false;
                return check;
            }
        }
        return check;
    }

    public static void printPrime() {
        Scanner input = new Scanner(System.in);
        int add = 100000;
        System.out.println("Nhap So muon in ra man hinh : ");
        int soutMax = input.nextInt();
        int sout = 0;
        for (int i = 2; ; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                sout++;
            }
            if (sout == soutMax) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        printPrime();
    }
}

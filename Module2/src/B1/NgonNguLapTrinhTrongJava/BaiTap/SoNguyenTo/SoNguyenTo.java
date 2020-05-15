package B1.NgonNguLapTrinhTrongJava.BaiTap.SoNguyenTo;

import java.util.Scanner;

public class SoNguyenTo {
    public static void isPrime(int number){
        boolean check =  true ;
        for (int i = 2 ; i<=Math.sqrt(number);i++){
            if(number%i==0){
                check = false ;
                return;
            }
        }
        if(check){
            System.out.println(number);
        }
    }
    public static void printPrime() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so Muon in den : ");
        int add = input.nextInt();
        for (int i = 2; i < add; i++) {
            isPrime(i);
        }
    }

    public static void main(String[] args) {
        printPrime();
    }
}

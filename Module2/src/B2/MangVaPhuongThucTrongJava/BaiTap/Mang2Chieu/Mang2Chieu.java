package B2.MangVaPhuongThucTrongJava.BaiTap.Mang2Chieu;

import java.util.Random;
import java.util.Scanner;

public class Mang2Chieu {
    public static int[][] Mang2Chieu() {
        Scanner x = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhap so ma tran muon in : ");
        int add = x.nextInt();
        int[][] arr = new int[add][add];
        for (int i = 0; i < add; i++) {
            for (int j = 0; j < add; j++) {
                arr[i][j] = rd.nextInt(100);
            }
        }
        return arr;
    }

    public static void printArray(int arrN[][]) {
        int arr[][] = arrN;
        System.out.println("Arr=[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr.length; j++) {
                if (j == arr.length-1) {
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print(arr[i][j] + "\t,");
                }

            }
            System.out.println("]");
        }
        System.out.println("]");
    }
    public static void sumArr(){
        int[][] arr = Mang2Chieu();
        printArray(arr);
        int sum = arr[0][0];
        for(int i = 1 ; i< arr.length ; i++){
            sum += arr[i][i];
        }
        System.out.println("Tổng hàng chéo của ma trận : Sum = "+ sum);
    }

    public static void main(String[] args) {
        sumArr();
    }
}


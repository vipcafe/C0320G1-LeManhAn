package B2.MangVaPhuongThucTrongJava.ThucHanh.UngDungDemSoSinhVienThiDo;

import java.util.Random;
import java.util.Scanner;

public class addStudent {
    public static int[] addArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử muốn thêm :");
        int index = input.nextInt();
        Random random = new Random();
        if (index > 30 || index < 0) {
            System.out.println("Vui lòng nhập lại giá trị ");
        } else {
            int arr[] = new int[index];
            for (int i = 0; i < arr.length; i++) {
                    arr[i] = random.nextInt(10);
            }
            return arr;
        }
        return addArray();
    }

    public static void printArray(int arr[]) {
        System.out.print("Arr=[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
    public static void studentPass(){
        int arr[] = addArray();
        int count = 0 ;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] >=5){
                count ++ ;
            }
        }
        printArray(arr);
        System.out.println("Có "+count+" sinh viên Pass");
    }

    public static void main(String[] args) {
       studentPass();
    }
}

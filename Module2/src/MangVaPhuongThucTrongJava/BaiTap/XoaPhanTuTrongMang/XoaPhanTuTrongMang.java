package MangVaPhuongThucTrongJava.BaiTap.XoaPhanTuTrongMang;

import java.util.Random;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static int[] addArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử muốn thêm :");
        int index = input.nextInt();
        Random random = new Random();
        if (index < 0) {
            System.out.println("Vui lòng nhập lại giá trị ");
        } else {
            int arr[] = new int[index];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100);
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

    public static void deleteArr() {
        int[] arr = addArray();
        int[] arrNew = new int[arr.length - 1];
        Scanner input = new Scanner(System.in);
        printArray(arr);
        System.out.println("Nhập giá trị muốn xóa : ");
        int x = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                for (int j = 0; j < arr.length; j++) {
                    if(i==j){
                        continue;
                    }
                    else if(j<i){
                        arrNew[j] = arr[j] ;
                    }
                    else {
                        arrNew[j-1] = arr[j] ;
                    }
                }
                printArray(arrNew);
                break;
            }
        }
    }

    public static void main(String[] args) {
        deleteArr();
    }
}

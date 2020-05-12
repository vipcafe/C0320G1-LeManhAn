package MangVaPhuongThucTrongJava.BaiTap.DaoNguocPhanTuMang;

import java.util.Scanner;

public class swapArray {
    public static int[] addArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử muốn thêm :");
        int index = input.nextInt();
        if (index > 20 || index < 0) {
            System.out.println("Vui lòng nhập lại giá trị ");
        } else {
            int arr[] = new int[index];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + " :");
                arr[i] = input.nextInt();
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

    public static void swapArr() {
        int[] arr = addArray();
        int[] arrNew = new int[arr.length];
        int count = 0;
        for (int i = arrNew.length - 1; i >= 0; i--) {
            arrNew[count] = arr[i];
            count++;
        }
        printArray(arrNew);
    }

    public static void main(String[] args) {
        swapArr();
    }

}

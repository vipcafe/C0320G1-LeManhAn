package B2.MangVaPhuongThucTrongJava.BaiTap.TimGiaTriNhoNhat;

import java.util.Scanner;

public class GTNN {
    public static int[] addArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử muốn thêm :");
        int index = input.nextInt();
        if (index < 0) {
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

    public static void findMinArr() {
        int[] arr = addArray();
        int find = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (find > arr[i]) {
                find = arr[i];
            }
        }
        printArray(arr);
        System.out.println("phần tử nhỏ nhất là :" + find);
    }

    public static void main(String[] args) {
        findMinArr();
    }
}

package B2.MangVaPhuongThucTrongJava.BaiTap.ThemPhanTuVaoMang;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static int[] addArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử muốn thêm :");
        int index = input.nextInt();
        int arr[] = new int[index];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " :");
            arr[i] = input.nextInt();
        }
        return arr;
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

    public static void addPositionInArr() {
        int arr[] = addArray();
        Scanner input = new Scanner(System.in);
        int arrNew[] = new int[arr.length + 1];
        System.out.print("Nhập vị trí muốn thay đổi (0->" + (arr.length - 1) + ") : ");
        int position = input.nextInt();
        if (position > (arr.length - 1) || position < 0) {
            System.out.println("vị trí này không có");
        } else {
            System.out.print("Nhập giá trị muốn thêm : ");
            int addInAarr = input.nextInt();
            for (int i = 0; i < arrNew.length; i++) {
                if (i < position) {
                    arrNew[i] = arr[i];
                } else if (i == position) {
                    arrNew[i] = addInAarr;
                } else {
                    arrNew[i] = arr[i - 1];
                }
            }
            arr = arrNew;
            printArray(arr);
        }
    }
    public static void main(String[] args) {
        addPositionInArr();
    }
}

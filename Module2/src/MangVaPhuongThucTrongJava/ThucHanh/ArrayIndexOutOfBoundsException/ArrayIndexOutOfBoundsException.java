package MangVaPhuongThucTrongJava.ThucHanh.ArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    private static int[] createRandom() {
        Random rd = new Random();
        int[] arr = new int[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
    public static  void main(String[] args) {
        int[] arr = new int[100];
        arr = createRandom();
        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập position của một phần tử bất kỳ: ");
        try {
            int x = scaner.nextInt();
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException array) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }

}


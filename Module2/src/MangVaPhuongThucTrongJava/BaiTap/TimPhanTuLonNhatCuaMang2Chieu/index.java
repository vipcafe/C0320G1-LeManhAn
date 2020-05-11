package MangVaPhuongThucTrongJava.BaiTap.TimPhanTuLonNhatCuaMang2Chieu;

import java.util.Random;
import java.lang.ArrayIndexOutOfBoundsException;

public class index {
    public static int[][] addArray() {
        int[][] arr = new int[2][9];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 9; j++) {
                Random rd = new Random();
                arr[i][j] = rd.nextInt(100);
            }
        }
        return arr;
    }

    public static void printArray() {
        int arr[][] = addArray();
        System.out.println("Arr=[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println("]");
        }
        System.out.println("]");
    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        printArray();
    }
}

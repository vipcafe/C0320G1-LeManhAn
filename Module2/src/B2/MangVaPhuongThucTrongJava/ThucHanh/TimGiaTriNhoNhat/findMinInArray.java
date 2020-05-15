package B2.MangVaPhuongThucTrongJava.ThucHanh.TimGiaTriNhoNhat;

public class findMinInArray {
    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {

                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.printf("Arr = [");
        printArray(arr);
        System.out.printf("]");
        System.out.println();
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
}

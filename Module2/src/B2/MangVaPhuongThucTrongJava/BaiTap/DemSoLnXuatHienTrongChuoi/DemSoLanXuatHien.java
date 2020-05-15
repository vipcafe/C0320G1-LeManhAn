package B2.MangVaPhuongThucTrongJava.BaiTap.DemSoLnXuatHienTrongChuoi;

import java.util.Scanner;

public class DemSoLanXuatHien {
    static Scanner x = new Scanner(System.in);

    public static String addString() {
        System.out.print("Nhập chuỗi muốn thêm :");
        String str = x.nextLine();
        return str;
    }

    public static String findString() {
        System.out.print("Nhập ký tự muốn tìm:");
        String strFind = x.nextLine();
        if (strFind.length() != 1) {
            System.out.println("vui lòng nhập 1 ký tự !!!");
            return addString();
        }
        return strFind;
    }

    public static void findInString() {
        int count = 0;
        String addString = addString();
        String findString = findString();
        for (int i = 0; i < addString.length()-1; i++) {
            if (findString.equals(String.valueOf(addString.charAt(i)))) {
                count++;
            }
        }
        System.out.printf("%s xuất hiện %d lần", findString, count);
    }
}

class testMain {
    public static void main(String[] args) {
        DemSoLanXuatHien.findInString();
    }
}
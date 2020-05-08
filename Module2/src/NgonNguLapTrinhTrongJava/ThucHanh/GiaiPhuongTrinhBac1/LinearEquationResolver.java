package NgonNguLapTrinhTrongJava.ThucHanh.GiaiPhuongTrinhBac1;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        double a;
        double b;
        double x;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a : ");
        a = input.nextDouble();
        System.out.print("Nhap b : ");
        b = input.nextDouble();
        x = (-b) / a;
        if (a == 0) {
            System.out.print("Phuong trinh vo nghiem");
        } else if (b == 0) {
            System.out.println("Phuong trinh vo so nghiem ");
        } else {
            System.out.println("x =" + x);
        }

    }
}

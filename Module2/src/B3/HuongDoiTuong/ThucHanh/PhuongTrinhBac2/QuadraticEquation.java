package B3.HuongDoiTuong.ThucHanh.PhuongTrinhBac2;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double delta() {
        return this.b * this.b - 4 * a * c;
    }

    void display(double x1, double x2) {
        System.out.println("X1 =" + x1);
        System.out.println("X2 =" + x2);
    }

    private void resultQuadraticEquation() {
        double x1;
        double x2;
        if (this.delta() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (this.delta() == 0) {
            x1 = x2 = (-this.b / (2 * this.a));
            display(x1, x2);
        } else {
            x1 = (-this.b + Math.sqrt(this.delta())) / 2 * this.a;
            x2 = (-this.b - Math.sqrt(this.delta())) / 2 * this.a;
            display(x1, x2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a : ");
        double a = input.nextDouble();
        System.out.println("Nhập b : ");
        double b = input.nextDouble();
        System.out.println("Nhập c : ");
        double c = input.nextDouble();
        QuadraticEquation no1 = new QuadraticEquation(a, b, c);
        no1.resultQuadraticEquation();
    }
}

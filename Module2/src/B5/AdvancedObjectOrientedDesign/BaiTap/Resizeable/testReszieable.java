package B5.AdvancedObjectOrientedDesign.BaiTap.Resizeable;

import java.util.Scanner;

public class testReszieable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập % muốn co giãn : ");
        int x = input.nextInt();
        System.out.println();
        Circle circle = new Circle(30);
        circle.resize(x);
        System.out.println();
        Rectangle rectangle = new Rectangle(20,30);
        rectangle.resize(x);
        System.out.println();
        Square square = new Square(40);
        square.resize(x);
    }
}

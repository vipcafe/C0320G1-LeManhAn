package B4.KeThua.BaiTap.LopCircleVaLopCylinder;

import java.util.Scanner;

public class Cylinder extends Circle  {

    private double height ;
    Cylinder() {
    }

    Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height ;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double volumeCylinder(){
        return super.areaCircle()*this.height;
    }

    public void display() {
        System.out.println("Cylinder :");
        System.out.print("+ Color : "+ getColor()+"\t");
        System.out.print("Height : "+ getHeight()+"\t");
        System.out.println("Radius : "+ getRadius()+"\t");
        System.out.println("+ Area Circle : "+ areaCircle());
        System.out.println("+ Volume Cylinder : "+ volumeCylinder());
    }

    public static void main(String[] args) {
        Scanner y =new Scanner(System.in);
        System.out.print("Nhập bán kính :");
        double radius = Double.parseDouble(y.nextLine());
        System.out.print("Nhập Màu sắc :");
        String color = y.nextLine();
        System.out.print("Nhập chiều cao :");
        double height = y.nextDouble();
        System.out.println();
        Cylinder x = new Cylinder(radius,color,height);
        x.display();
    }
}

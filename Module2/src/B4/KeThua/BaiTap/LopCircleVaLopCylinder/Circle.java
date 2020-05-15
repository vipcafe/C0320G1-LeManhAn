package B4.KeThua.BaiTap.LopCircleVaLopCylinder;

public class Circle {
    private double radius;
    private String color;

    Circle() {
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double areaCircle() {
        return Math.PI * Math.pow(this.radius,2);
    }
}

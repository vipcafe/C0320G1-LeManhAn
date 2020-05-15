package B4.KeThua.BaiTap.Triangle;

public class Triangle {
    private float side1 = 1;
    private float side2 = 1;
    private float side3 = 1;

    Triangle() {
    }

    Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }

    public double getArena() {
        return Math.sqrt((this.side1 + this.side2 + this.side3) * (this.side1 + this.side2 - this.side3) * (this.side2 + this.side3 - this.side1) * (this.side3 + this.side1 - this.side2)) / 4;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        System.out.printf("A = %f \t B = %f \t C = %f", this.side1, this.side2, this.side3);
        System.out.println();
        System.out.println("Dien tich : " + getArena());
        System.out.println("Chu vi : " + getPerimeter());
        return super.toString();
    }
}

class testTriangle {
    public static void main(String[] args) {
        Triangle noww = new Triangle(4, 3, 5);
        noww.toString();
    }

}

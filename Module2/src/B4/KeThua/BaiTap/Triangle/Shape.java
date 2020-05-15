package B4.KeThua.BaiTap.Triangle;

public class Shape extends Triangle {
    String color = "red";

    Shape() {
        String color = "red";
    }

    Shape(float side1 , float side2 , float side3,String color){
        super(side1,side2,side3);
        this.color = color ;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        System.out.println("color : "+color);
        return super.toString();
    }
}

class testShape{
    public static void main(String[] args) {
        Shape x = new Shape(1,4,3,"redx");
        x.toString();
    }
}

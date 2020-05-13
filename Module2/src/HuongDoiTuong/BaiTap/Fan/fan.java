package HuongDoiTuong.BaiTap.Fan;

public class fan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private int speed;
    private double radius;
    private boolean on, off;
    private String color;

    fan() {
        this.speed = slow;
        this.radius = 5.f;
        this.color = "Yellow";
    }

    fan(int speed , double darius , String color){
        this.speed = speed;
        this.radius = darius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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
}

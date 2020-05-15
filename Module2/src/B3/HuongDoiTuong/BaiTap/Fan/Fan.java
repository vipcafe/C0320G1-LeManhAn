package B3.HuongDoiTuong.BaiTap.Fan;

public class Fan {
    public static final int slow = 1;
    public static final int medium = 2;
    public static final int fast = 3;
    private int speed;
    private double radius;
    private boolean status;
    private String color;

    public Fan() {
        this.speed = slow;
        this.radius = 5;
        this.color = "Yellow";
        this.status = false ;
    }

    public Fan(int speed, double darius, String color,boolean status) {
        this.speed = speed;
        this.radius = darius;
        this.color = color;
        this.status = status ;
    }

    public void displayFan(){
        System.out.println("Color : "+this.color);
        System.out.println("Radius : "+this.radius);
    }

    public void Status(){
        if(this.status){
            System.out.println("Fan is on");
            System.out.println("Speed : "+this.speed);
            displayFan();
            System.out.println();
        }
        else {
            System.out.println("Fan is off");
            displayFan();
        }
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

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static void main(String[] args)  {
        Fan fan1 = new Fan(fast,10,"Blue",true );
        fan1.Status();
        Fan fan2 = new Fan();
        fan2.Status();

    }
}

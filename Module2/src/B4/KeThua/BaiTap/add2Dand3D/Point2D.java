package B4.KeThua.BaiTap.add2Dand3D;

public class Point2D  {
    private float x;
    private float y;

    Point2D() {
        this.x = 0;
        this.y = 0;
    }

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY(float x, float y) {
        float xy[] = {x, y};
        return xy;
    }

    @Override
    public String toString() {
        System.out.println("X = " + this.x);
        System.out.println("Y = " + this.y);
        return super.toString();
    }

    public static void main(String[] args) {
        Point2D d2 = new Point2D(5.0f, 10.0f);
        d2.toString();

    }
}

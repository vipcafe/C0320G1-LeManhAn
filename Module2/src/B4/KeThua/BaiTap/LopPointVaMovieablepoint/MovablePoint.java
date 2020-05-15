package B4.KeThua.BaiTap.LopPointVaMovieablepoint;

public class MovablePoint extends Point {
    private float xSpped = 0f;
    private float ySpeed = 0f;
    MovablePoint(){}
    MovablePoint(float x, float y, float xSpped, float ySpeed) {
        super(x,y);
        this.xSpped = xSpped;
        this.ySpeed = ySpeed;
    }

    public float getxSpped() {
        return xSpped;
    }

    public void setxSpped(float xSpped) {
        this.xSpped = xSpped;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpped , float ySpeed){
        this.xSpped = xSpped ;
        this.ySpeed = ySpeed ;
    }

    public float[] getSpeed(){
        float[] XYspeed = {xSpped,ySpeed};
        return XYspeed ;
    }

    @Override
    public String toString() {
        return String.format("(%f , %f) \t speed = (%f ,%f)",getX(),getY(),xSpped,ySpeed);
    }

    public MovablePoint move(){
        setX(getX()+xSpped);
        setY(getY()+ySpeed);
        return this;
    }

}
class testMain{
    public static void main(String[] args) {
        MovablePoint x = new MovablePoint(10,20,5,10);
        System.out.println(x);
        x.move();
        System.out.println(x);
    }
}
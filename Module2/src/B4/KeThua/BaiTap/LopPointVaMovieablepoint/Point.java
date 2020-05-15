package B4.KeThua.BaiTap.LopPointVaMovieablepoint;

public class Point {
    private float x = 0 ;
    private float y = 0 ;

    Point(){}

    Point(float x , float y){
        this.x = x ;
        this.y = y ;
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

    public void setXY(float x , float y){
        this.x = x ;
        this.y = y ;
    }
    public float[] getXY(float x , float y){
        float[] xy = {x,y};
        return xy;
    }

    @Override
    public String toString() {
        System.out.println("X = "+this.x+"\tY = "+this.y);
        return super.toString();
    }
}

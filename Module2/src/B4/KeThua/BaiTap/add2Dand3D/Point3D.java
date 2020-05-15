package B4.KeThua.BaiTap.add2Dand3D;

public class Point3D extends Point2D {
    private float z = 0;

    Point3D() {
    }

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ(){

        float[] XYZ = new float[3];
        XYZ[0] = getX();
        XYZ[1] = getY();
        XYZ[2] = this.z ;
        return XYZ;
    }


    public String toString() {
        System.out.println("Z = "+this.z);
        return super.toString();
    }

    public static void main(String[] args) {
        Point3D xxx = new Point3D(2,3,4);
        xxx.getXYZ();
        xxx.toString();
    }

}

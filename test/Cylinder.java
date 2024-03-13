import static java.lang.Math.*;

public class Cylinder {
    private double radius;
    private double height;
    public  double  PI = 3.143;


    public Cylinder(){
        this.radius = radius;
        this.height = height;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }


    public double getCylinderVolume() {
        return height * radius * radius * 3.143;

    }
}
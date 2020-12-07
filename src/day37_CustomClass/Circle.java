package day37_CustomClass;

public class Circle {

    public  double radius;
    public double PI;
    public double perimeter;
    public double area;



    public void setInfo(double radius, double PI){
        this.radius=radius;
        this.PI=PI;
        perimeter=2*PI*radius;
        area=PI*radius*radius ;

    }

    @Override
    public String toString() {
        return
                "radius=" + radius +
                "\n perimeter = " + perimeter +
                "\n area = " + area;
    }
}

package day46_JavaRecap.ShapeTask;

import Office_Hours.Practice_12_09_2020.Pizza;

public class Circle extends Shape {

    private final static double PI=3.14;//internal use only
    private double r,d;

//    public Circle(double r) {
//        this.r=r;                 //======>if you dont extend superclass
//        d=r*2;
//    }

    public Circle(double r){
        super("Circle");//set the name of the shape
        if (r <= 0){
            throw new RuntimeException("No Such a Circle with a radius of: "+r);
        }

        setD(r*2);
        setR(r);
        //this.r=r;
       // this.d=r*2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public double area() {
        return r*r*PI;
    }

    @Override
    public double perimeter() {
        return PI*d;
    }
}
/*
2. create a class called Circle
                Attributes: name, r, d, PI
                Add a constructor that can set the instances of the Circle:
                        if the radius of the circle is 0 or negative, throw an exception with a message of: "No Such a Circle with a radius of: r"  replace the r with given radius
                methods:
                    area(): returns the area of the circle
                    perimeter(): returns the perimeter of the circle
 */
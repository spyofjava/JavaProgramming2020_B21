package day38_Statics;

import java.text.DecimalFormat;

public class Circle {

    public double radius, diameter, area, perimeter;
    //public double PI=3.14;//----->if it is used, it needs to call by Object
    static double PI=3.14;

    public void setInfo(double radius){
        this.radius = radius;
        diameter = 2 * radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea(){
        return     radius * radius * PI;
    }

    public double calculatePerimeter(){
        return diameter * PI;
    }


    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + df.format(area )+
                ", perimeter=" + df.format( perimeter )+
                '}';
    }

    public boolean equals(Circle circle){
        System.out.println(this.radius);
        System.out.println(circle.radius);
        return   this.radius == circle.radius;
    }
}

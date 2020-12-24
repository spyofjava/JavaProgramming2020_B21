package day41_Encapsulation;
///////////////////////////////////////  ----  5  ----  /////////////////////////
public class CircleObjects_5 {

    public static void main(String[] args) {

        Circle_5 c1 = new Circle_5(4);

        // System.out.println(c1.area);
        System.out.println(c1.getDiameter());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        System.out.println("=======================");
        c1.setRadius(6);
        System.out.println(c1.getDiameter());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter() );


    }

}
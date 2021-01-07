package day46_JavaRecap.ShapeTask;

public class ShapeObject {
    public static void main(String[] args) {

        Circle circle1=new Circle(0);
        System.out.println(circle1);
        System.out.println(circle1.getR());
        System.out.println(circle1.getD());
        System.out.println(circle1.area());
        System.out.println(circle1.perimeter());
        System.out.println(circle1.toString());
        System.out.println();
        circle1.setR(5);
        System.out.println(circle1.area());




    }


}

package day38_Statics;

public class CircleObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle();
        circle1.setInfo(5);

        System.out.println(circle1);

        // circle1.equals()

        Circle circle2 = new Circle();
        circle2.setInfo(10);

        System.out.println(circle2);

        System.out.println(circle1 == circle2);
        System.out.println( circle1.equals(circle2)   );

        circle1.equals(circle2);

        //System.out.println(new Circle().PI);//--->if it is instance variable
        System.out.println(Circle.PI); //-->if it is static variable


    }

}

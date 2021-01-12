package day47_Abstraction;

public  class Circle extends ShapeTasks {
    public static double PI = 3.14;
    public  double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area(){
        return PI*radius*radius;
    }

    @Override
    public  double perimeter(){
        return 2*PI*radius;
    }





}

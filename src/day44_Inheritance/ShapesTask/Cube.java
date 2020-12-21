package day44_Inheritance.ShapesTask;

public class Cube extends Shape {

    public double side;

    public Cube(double side) {
        this.side = side;
        setInfo("Cube");
    }

    @Override
    public double calcArea() {
        Square square = new Square(side);// one square of the cube
        double area = square.calcArea();//area of one square
        return area * 6;
    }


//    @Override
//    public double calcArea() {
//        return new Square(side).calcArea()*6;
//    }

    @Override
    public double calcPerimeter() {
        return super.calcPerimeter();
    }
}

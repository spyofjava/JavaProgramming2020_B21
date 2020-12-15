package DailyExercise.Dec_14_StaticBlock;

public class Circle {

    public double radius,diameter, area,perimeter;

    public void setInfo(double radius){
        this.radius=radius;
        diameter=2*radius;
        area=calculateArea();
        perimeter=calculatePerimeter();

    }

    public double calculateArea(){
        return radius*radius*Math.PI;
    }

    public double calculatePerimeter(){
        return diameter*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}

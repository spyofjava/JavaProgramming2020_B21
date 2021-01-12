package day47_Abstraction;

public abstract class ShapeTasks {

    public  String name;

    public ShapeTasks(String name) {// not concrete
        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();






}

package day47_Abstraction.ShapeTasks;

public abstract class Shape {  // not concrete

    public String name;

    public Shape(String name) {
        this.name = name;
    }//===> Constructor with parameter

    public abstract double area();//----> abstract method
    public abstract double perimeter();//----> abstract method



}
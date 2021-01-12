package day47_Abstraction.CarTask;

import day47_Abstraction.ShapeTasks.Circle;
import day47_Abstraction.ShapeTasks.Rectangle;
import day47_Abstraction.ShapeTasks.Square;

public class CarShop {

    public static void main(String[] args) {


       // Car car= new Car("brand","car1","white",2010,20000);
        Mercedes mercedes=new Mercedes("G class", "red", 2018, 45000);
        Toyota toyota=new Toyota("Camry", "yellow", 2017, 30000);
        BMW bmw=new BMW("X5", "white", 2015, 35000);
        Tesla tesla=new Tesla("Model 3", "blue", 2021, 50000);


        System.out.println("Start mercedes- ");
        mercedes.start();

        System.out.println("Start toyota- ");
        toyota.start();

        System.out.println("Start bmw- ");
        bmw.start();

        System.out.println("Start tesla- ");
        tesla.start();
    }
}

package day46_JavaRecap.CarTask;

import java.time.LocalDate;
import java.util.InputMismatchException;

public class Car {
    public static int numberOfTires=4;
    public static boolean hasEngine,hasSeats;
    static {
        numberOfTires=4;
        hasEngine=true;
        hasSeats=true;
    }
    public String brand,model,color;//birdfen fazla brand var o tuzden brand static degil
    public int year;
    public double price;

    public Car(String brand, String model, String color, int year, double price) {

        if (year> LocalDate.now().getYear()+1 || year <= 0) {
            throw new InputMismatchException("Invalid Year "+year) ;
        }

        if (price<0) {
            throw new RuntimeException("Car price can't be negative or zero "+price);

        }

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;

    }


    public void start(){
        System.out.println(brand+" "+model+" is starting");
    }

    public final void drive(){ //artik degimeyecek
        System.out.println("driving "+brand+" "+model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand= '" + brand + '\'' +
                ", model= '" + model + '\'' +
                ", color= '" + color + '\'' +
                ", year= " + year +
                ", price= $" + price +
                '}';
    }
}
/*
Car Task:
        1. create a class called Car:
                    Attributes: Brand, Model, Color, Year, Price
                    Add a constructor that can initialize the instances:
                                if the price is set to negative throw an exception with a message of: "Car price can't be negative"
                                if the the year is greater than current year or negative, throw an exception with a message of: "Invalid Year"
                    Methods: start, drive, toString

 */
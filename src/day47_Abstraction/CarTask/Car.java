package day47_Abstraction.CarTask;

public abstract class Car {

    public String brand,model,color;
    public  int year;
    public double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public abstract void start();


    @Override
    public String toString() {
        return "Car{" +
                "brand=' " + brand + '\'' +
                ", model=' " + model + '\'' +
                ", color=' " + color + '\'' +
                ", year= " + year +
                ", price= $" + price +
                '}';
    }
}
/*
CarTask:

        Car
                start();

        Toyota extends Car:
            start(){   // how it's done
                insert key: twist the key to ignition
            }
        Mercedes:
            start(){   // how it's done
                push button: press brake, push start button
            }
        Tesla:
            start(){    // how it's done
                voice control: say start
            }
        BMW:
            start(){   // how it's done
                call mechanic: oil change, jump start, ask your frinds to push
            }

 */
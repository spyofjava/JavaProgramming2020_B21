package day37_CustomClass;

import java.time.LocalDate;

public class Car {

    public String brand, model, color;
    public LocalDate DOfB; // 2019-7-7
    public double price, mileage;
    public int year;  // 2019

    public void setInfo(String brand, String model, String color, LocalDate DOfB, double price, double mileage) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.DOfB = DOfB;
        this.price = price;
        this.mileage = mileage;
        year = DOfB.getYear();
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", DOfB=" + DOfB +
                ", price=" + price +
                ", mileage=" + mileage +
                ", year=" + year +
                '}';
    }


}

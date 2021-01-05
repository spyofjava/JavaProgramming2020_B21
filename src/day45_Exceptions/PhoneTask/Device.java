package day45_Exceptions.PhoneTask;

public class Device {

    public String brand,model;          //
    public final String country;        //====>attributes
    public double price;                //

    public Device(String brand,String model,String country,double price) {
        this.country = country;
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand= '" + brand + '\'' +
                ", model= '" + model + '\'' +
                ", country= '" + country + '\'' +
                ", price= $" + price +
                '}';
    }
}
/*
Warmup task:
    Phone Task:
            creata a class called device:
                attributes: brand, model, price, country
                methods: toString
    create a class called phone:
                attributes: brand, model, price, country
                methods: call, text,  toString
    create the following subclasses of phone:
                        1. iPhone
                        2. Samsung
                        3. Nokia
    create constructors in each sub class that can initialize the instance variables

 */
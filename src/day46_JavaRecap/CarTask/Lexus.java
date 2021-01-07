package day46_JavaRecap.CarTask;

public final class Lexus extends Car{

    public Lexus( String model, String color, int year, double price) {
        super("Lexus", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("starting "+brand+" "+model+" by inserting the key");
    }
}
/*
2. create the following sub classes of Car:
                        1. Mercedes
                        2. BMW
                        3. Lexus
                    Make sure those class cannot be inherited
                    each sub class should have constructor with 4 arguments: Model, Color, Year, Price
 */
package day46_JavaRecap.CarTask;

public class BMW extends Car{

    public BMW( String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }

    public void start(){
        System.out.println("starting "+brand+" "+model+" by calling mechanic");
    }

    public void autopark(){
        System.out.println("Auto parking "+brand+" "+model);
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
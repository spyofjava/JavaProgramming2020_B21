package day46_JavaRecap.CarTask;

public class Tesla extends Car {


    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("starting "+brand+" "+model+" by voice control");
    }



    public void autopilot(){
        System.out.println("Self driving "+brand+" "+model);
    }
}

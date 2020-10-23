package day05_AritmeticOperators;

public class Concatenation_Practice {
    public static void main(String[] args) {
        int houseNumber= 7925;
        String streetName="Johns Branch Dr";
        String cityName="McLean";
        String state="VA";
        int zipCode=22000;

        String fullAddress= houseNumber+" "+streetName+"\n "+cityName+" "+state+" "+zipCode;
        System.out.println(fullAddress);
        System.out.println("=====================================");

        String brand="Toyota";
        String model="Camry";
        int year=2010;
        int milage=55000;
        double price=18000;
        String color="Red";
        String car= year+" "+brand+" "+model+", "+milage+" miles ,"+color+", $"+price;

        System.out.println(car);



    }
}

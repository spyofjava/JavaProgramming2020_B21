package day46_JavaRecap.CarTask;

public class CarMax {

    public static void main(String[] args) {
        Mercedes mercedes=new Mercedes("G Class", "Red", 2021, 300000);
        Lexus lexus=new Lexus("RX 3350", "White", 2018, 20000);
        BMW bmw=new BMW("X6", "Black", 2019, 45000);
        Tesla tesla=new Tesla("Model 3", "Blue", 2020, 50000);

        //mercedes.autopark();//this is unique for mercedes
        mercedes.start();
        lexus.start();
        bmw.start();
        tesla.start();

        System.out.println("===========================");

        mercedes.drive();
        lexus.drive();
        bmw.drive();
        tesla.drive();

        System.out.println("============================");


        bmw.autopark();

        tesla.autopilot();

    }



}
/*
3. create a class called CarMax
                create objects of each Cars, and set:
                        year: 2022
                        price: -25000
 */
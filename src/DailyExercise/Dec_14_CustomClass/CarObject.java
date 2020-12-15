package DailyExercise.Dec_14_CustomClass;

import java.time.LocalDate;

public class CarObject {


    public static void main(String[] args) {

        Car car1=new Car();

        car1.setInfo("Toyota", "Sienna", "blue", 2019, 20000);
        car1.model="Prius";
        car1.year=2000;
        System.out.println(car1);

        System.out.println("====================================");
        Car car2=new Car();
        car2.setInfo("Volvo", "S90", "White", 2020, 29000);
        System.out.println(car2);

    }
}

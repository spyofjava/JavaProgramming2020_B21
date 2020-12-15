package DailyExercise.Dec_14_CustomClass;

public class Car {

    public String brand,model,color;
    public int year;
    public double price;


    public void setInfo(String brand,String model,String color,int year,double price){

        this.brand=brand;
        this.model=model;
        this.color=color;
        this.year=year;
        this.price=price;
    }


    @Override
    public String toString() {
        return  "brand= " + brand +
                "\nmodel= " + model +
                "\ncolor= " + color +
                "\nyear= " + year +
                "\nprice= $" + price;
    }
}

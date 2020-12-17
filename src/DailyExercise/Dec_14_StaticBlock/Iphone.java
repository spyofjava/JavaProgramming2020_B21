package DailyExercise.Dec_14_StaticBlock;

public class Iphone {

    public String model,color, storage;
    public double price;

    public static String brand="Apple", OS="IOS",madeIn="China";

    public void call(long phoneNumber){
        System.out.println("Iphone "+model+" is calling "+phoneNumber);
    }


    public static void model(){
        System.out.println("11 Pro Max");
    }
    public void setInfo(String model,String color,String storage,double price){
        this.model=model;
        this.color=color;
        this.storage=storage;
        this.price=price;
    }



    @Override
    public String toString() {
        return  "brand= "+brand+
                " model= " + model +
                " color= " + color  +
                " storage= " + storage +
                " price= $" + price+
                " Operating System: "+OS;
    }
}

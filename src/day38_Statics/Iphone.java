package day38_Statics;

public class Iphone {


    public  String model,color,storage;
    public double price;

    public static String brand= "Apple",OS= "IOS",madeIn="China";

    public void call(long phoneNumber){
        System.out.println("Iphone "+ model+" is calling "+phoneNumber);
    }

    public void getInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Operating System: "+OS);
        System.out.println("Made in: "+madeIn);
    }

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Color: "+color+", Price: "+price+", Operating System: "+OS;
    }
}

package day42_Inheritance.DeviceTask;

public class Tv extends Device {
    public static boolean hasChannel,hasCable;

    public Tv(String brand,String model,double price){
        setInfo("TV", brand,model,price);
    }


    static {
        hasChannel=true;
        hasCable=true;
    }

    public void channelUp(){
        System.out.println("Channel Up "+brand+" "+model);
    }

    public void channelDown(){
        System.out.println("Channel down "+brand+" "+model);

    }
}

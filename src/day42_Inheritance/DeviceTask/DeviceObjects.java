package day42_Inheritance.DeviceTask;

public class DeviceObjects {

    public static void main(String[] args) {

        Tv tv=new Tv("samsung", "LX32",499.99);
        System.out.println(tv);
        tv.channelUp();
        tv.channelDown();
        tv.turnOn();
        tv.turnOff();


        Phone phone=new Phone("Iphone","12 Pro Max",799.99);
        System.out.println(phone);

        phone.call(2136546);
        phone.text(2165463);
    }
}

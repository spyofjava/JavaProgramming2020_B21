package day38_Statics;

public class IphoneObject {
    public static void main(String[] args) {

        Iphone phone1 = new Iphone();

        Iphone phone2 = new Iphone();

        Iphone phone3 = new Iphone();

        Iphone phone4 = new Iphone();

        //  phone1.OS = "Android";

        System.out.println(phone1.OS);
        System.out.println(phone2.OS);
        System.out.println(phone3.OS);
        System.out.println(phone4.OS);

        System.out.println("============================");
        Iphone.getInfo();

        phone1.model();

        Iphone.model();

        //Iphone.call(021654651); it gives an error because it isn't static. static is called from static

        phone1.call(021564132);

    }
}

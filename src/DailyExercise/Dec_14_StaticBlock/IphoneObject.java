package DailyExercise.Dec_14_StaticBlock;

public class IphoneObject {
    public static void main(String[] args) {

        Iphone phone1=new Iphone();
        phone1.setInfo("XR", "blue","120GB",1320 );
        System.out.println(phone1);
        System.out.println(phone1.brand);;

        phone1.call(321654655);



    }

}

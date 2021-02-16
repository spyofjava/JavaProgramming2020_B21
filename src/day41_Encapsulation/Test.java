package day41_Encapsulation;

public class Test {

    public static void main(String[] args) {
        System.out.println(Data.publicVariable);
    //    System.out.println(Data.privateVariable);
        System.out.println(Data.defaultVariable);

        Data obj = new Data();

        Data.publicMethod();
      //  Data.privateMethod();
        Data.defaultMethod();







        //----accessing --->public static
        System.out.println(Data.publicVariable);


        //----accessing --->protected static
        System.out.println(Data.protectedVariable);

        //----accessing --->default static
        System.out.println(Data.defaultVariable);

        //----accessing --->orivate static
       // System.out.println(Data.privateVariable);---> this give us compile time error . we have to use getter setter method to access private variable

        System.out.println(obj.getprivateVariable());  // line 8


    }

}




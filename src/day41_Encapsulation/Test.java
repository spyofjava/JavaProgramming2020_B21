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


        System.out.println("-------------------------\n");

        //----accessing --->public static
        System.out.println("public: "+Data.publicVariable);

        //----accessing --->protected static
        System.out.println("protected: "+Data.protectedVariable);

        //----accessing --->default static
        System.out.println("default: "+Data.defaultVariable);

        //----accessing --->orivate static
       // System.out.println(Data.privateVariable);---> this give us compile time error . we have to use getter setter method to access private variable

        System.out.println("orivate: "+obj.getprivateVariable());  // line 8
       // Getter IS NOT TO STATIC WE could call by obj.

        //----accessing --->public method
        Data.publicMethod();

        //----accessing --->default method
        Data.defaultMethod();

        //----accessing --->protected method
        Data.protectedMethod();

        //----accessing --->private method
        System.out.println(Data.getprivateMethod());
       // Getter is to STATIC WE could call by Class Name.





    }

}




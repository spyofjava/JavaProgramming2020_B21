package day41_Encapsulation;
///////////////////////////////////////  ----  2  ----  /////////////////////////
public class Data_2 {

    public static String publicVariable = "A";
    private static String privateVariable = "B";
    static String defaultVariable = "C";  // default access modifier

     protected static String protectedVariable = "D";

    Data_2(){//====>Constructor

    }

    public static void publicMethod(){
        System.out.println("Public Method");
        protectedMethod();

    }

    private static void privateMethod(){
        System.out.println("private Method");

    }

    static void defaultMethod(){
        System.out.println("default Method");
    }

    protected static void protectedMethod(){
        System.out.println("Protected Method");
        System.out.println(privateVariable);
        System.out.println(protectedVariable);

    }



}

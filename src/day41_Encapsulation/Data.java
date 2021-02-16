package day41_Encapsulation;

public class Data {

    public static String publicVariable = "A";//----line 1
    private static String privateVariable = "B";//----line 2
    static String defaultVariable = "C";  // default access modifier //----line 3

     protected static String protectedVariable = "D";//----line 4

    Data(){

    }


    public static void publicMethod(){
        System.out.println("Public Method");
    } //----line 5

    private static void privateMethod(){
        System.out.println("private Method");
    }//----line 6

    static void defaultMethod(){
        System.out.println("default Method");
    }//----line 7


    public String getprivateVariable(){
        return privateVariable;
    }  //----line 8


}

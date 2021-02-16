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

    private static String privateMethod(){
        return ("private Method");
    }//----line 6

    static void defaultMethod(){
        System.out.println("default Method");
    }//----line 7

    protected static  void protectedMethod(){
        System.out.println ("Protected Method");
    }//--- line 9

    public String getprivateVariable(){
        return privateVariable;
    }  //----line 8

    public static String getprivateMethod(){
      return   privateMethod();
    }

}

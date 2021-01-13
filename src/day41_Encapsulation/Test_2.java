package day41_Encapsulation;
///////////////////////////////////////  ----  2  ----  /////////////////////////
public class Test_2 {

    public static void main(String[] args) {
        System.out.println(Data_2.publicVariable); //====> "A"
   //         System.out.println(Data_2.privateVariable);//====> error
        System.out.println(Data_2.defaultVariable);//====> "C"

        Data_2 obj = new Data_2();
        obj.publicMethod();



// =====  or ====
        Data_2.publicMethod();
         // Data_2.privateMethod();
        Data_2.defaultMethod();

        System.out.println("====================");
        Data_2.publicMethod();


    }



}




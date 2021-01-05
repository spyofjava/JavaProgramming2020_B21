package day45_Exceptions;

public class Throws_VS_TryCatch {

    public static void main(String[] args) {

        method1();
        System.out.println("Try & Catch");

        //method2();



    }




    public static void method1(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
    }



    public static void method2() throws InterruptedException{
        Thread.sleep(3000);
    }


    public static void sleep(long seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }





}

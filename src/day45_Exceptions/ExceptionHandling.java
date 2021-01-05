package day45_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {


        //StringIndexoutofBound
        String name="ibrahim";

        try {
            Thread.sleep(2000);
            //System.out.println(name.substring(200,300));
        }catch (InterruptedException e){

            //System.out.println(e.getMessage());
           // e.printStackTrace();
        }


        try {
            System.out.println(100/0);
        }catch (ArithmeticException e){ //you can write RuntimeException inside the parenthesis
            System.out.println("Unchecked exception is occured"+e.getMessage());
            e.printStackTrace();//if you add this step ,you can see the error message

        }

        //Thread.sleep(5000);



        System.out.println("Test completed");







    }



}

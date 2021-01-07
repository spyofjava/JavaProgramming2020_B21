package day45_Exceptions;

public class LuchBreakException extends RuntimeException{

    public LuchBreakException(){
        super("It's time for lunch");
    }


    public LuchBreakException(String msg){
        super(msg);
    }

}






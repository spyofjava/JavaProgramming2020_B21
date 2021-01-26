package day43_Inheritance.calisma2;

public class substruction extends operations{
    public substruction(double num1, double num2) {
        super(num1, num2);
    }
    public String sub(){
        return "result= "+(num1-num2);
    }
}

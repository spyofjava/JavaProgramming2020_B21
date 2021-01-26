package day43_Inheritance.calisma2;

public class multiplication extends operations{
    public multiplication(double num1, double num2) {
        super(num1, num2);

    }
    public String multiply(){
        return "result= "+(num1*num2);
    }
}

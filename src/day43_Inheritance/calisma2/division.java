package day43_Inheritance.calisma2;

public class division extends operations{
    public division(double num1, double num2) {
        super(num1, num2);

    }

    public String divide(){
        return "result= "+(num1/num2);
    }
}

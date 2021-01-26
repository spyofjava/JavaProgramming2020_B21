package day43_Inheritance.calisma2;

public class addition extends operations {


    public addition(double num1, double num2) {
        super(num1, num2);
    }

    public String add(){
        return "result= "+(num1+num2);
    }
}

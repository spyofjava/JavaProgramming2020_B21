package day43_Inheritance.calisma2;

public class operations {

    public double num1,num2;


    public operations(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;

    }


    @Override
    public String toString() {
        return "operations{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}


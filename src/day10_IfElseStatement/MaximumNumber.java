package day10_IfElseStatement;

public class MaximumNumber {
    public static void main(String[] args) {
        int number1=420;
        int number2=84;
        int number3=156;

        boolean number1ismax=number1>number2 && number1>number3;// if n1 is greater then both of n2&n3, it means,n1 is max number
        boolean number2ismax=!number1ismax && number2>number3;// if n1 isnot greater and  n2>n3, it means,n2 is max number
        boolean number3ismax=!number1ismax && !number2ismax;// if n1 isnot greater and  n2>n3, it means,n2 is max number


        if (number1ismax){
            System.out.println("Maximum number is "+number1);
        }

        if(number2ismax){
            System.out.println("Maximum number is "+number2);

        }
        if(number3ismax){
            System.out.println("Maximum number is "+number3 );
        }






    }
}

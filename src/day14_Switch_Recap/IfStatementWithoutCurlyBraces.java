package day14_Switch_Recap;

public class IfStatementWithoutCurlyBraces {
    public static void main(String[] args) {

        int  a=10;

        if (a%2==0)
            System.out.println("Even Number");

        else
            System.out.println("odd Number");
            // if there is an only one statement its not necessary to give curly braces

        System.out.println("=============================");


        if (a%2==0) {
            System.out.println("Even Number");
            System.out.println(a + " is even number");
        }
        else{
            System.out.println("odd Number");
            System.out.println(a + " is odd number");
        }

        System.out.println("=============================");

        int b=10;

        if (b>0) System.out.println("positive");
        else if (b<0) System.out.println("Negative");
        else System.out.println("zero");

        System.out.println("=============================");

        int number=5;
        String day="";
        if (number>=1 && number<=7)
            if (number==1)
                System.out.println("monday");

            else if (number==2)
                System.out.println("tuesday");

            else if (number==3)
                System.out.println("wednesday");

            else if (number==4)
                System.out.println("thursday");

            else if (number==5)
                System.out.println("friday");

            else if (number==6)
                System.out.println("saturday");

            else
                System.out.println("sunday");

        else
            day="Invalid";

    }
}

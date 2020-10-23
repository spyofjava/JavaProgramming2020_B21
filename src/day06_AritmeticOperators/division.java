package day06_AritmeticOperators;

public class division {
    public static void main(String[] args) {
        /*
 write a program that can calculate first number by second number, and print out the result
            num1 = 10;
            num2 = 3;
            output:
                10 divide by 3 is equal to 3 with a remainder of 1
            num1 = 20
            num2 = 6
            output:
                 20 divide by 6 is equal to 3 with a remainder of 2
            num1 = 100;
            num2 = 20;
            output:
                 100 divide by 20 is equal to 5 with a remainder of 0
 */



        /*
        System.out.println(20/3 );
        System.out.println(20.0/3);
        System.out.println(20/3.0);
        System.out.println(10*2.0);
        System.out.println("12"+3);
        System.out.println(12+3.0);
        System.out.println('a'+3);//in ascii table a==97
        double a=10/3.0;
        System.out.println(a);
        int j=3/2;
        System.out.println(j);
        double y=3/2;
        System.out.println(y);
         */

        int num1 = 100;
        int num2 = 20;

        //  /:
        int result =  num1 / num2; //3

        // %:
        int remainder = num1 % num2; //1

        System.out.println(num1 + " divide by " + num2 + " is equal to "  + result + " with a remainder of " + remainder);

        System.out.println("=================================================");

        // System.out.println( 9 / 0 );







    }
}

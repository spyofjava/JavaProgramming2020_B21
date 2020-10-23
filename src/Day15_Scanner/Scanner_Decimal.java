package Day15_Scanner;

import java.util.Scanner;

public class Scanner_Decimal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a float number");
        float floatnumber=input.nextFloat();
        System.out.println("Number is "+floatnumber);

        System.out.println("Enter a double number: ");
        double doublenumber= input.nextDouble();;
        System.out.println("Number is "+ doublenumber);

        System.out.println(input.nextFloat()+input.nextDouble());



    }
}

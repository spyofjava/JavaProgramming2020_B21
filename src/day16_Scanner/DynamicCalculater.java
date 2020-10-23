package day16_Scanner;

import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class DynamicCalculater {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("number1: ");
            double number1 = input.nextDouble();
            System.out.print("number2: ");
            double number2 = input.nextDouble();
            input.nextLine();
            System.out.print("operator: ");
            String operator = input.nextLine();
            input.close();

            double result = 0;
            boolean isvalid = true;
            switch (operator) {
                case "+":
                    result = number1 + number2;

                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    result = number1 / number2;
                    break;
                case "%":
                    result = number1 % number2;

                default:
                    // System.out.println("invalid operator");
                    isvalid = false;
            }


            if (isvalid) {
                System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
            } else {
                System.out.println(operator + " is invalid operator");
            }



    }
}

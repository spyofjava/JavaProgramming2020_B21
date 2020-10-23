package day20_ForLoop;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

        for (int i=0;i<=10;i--){//1, 0

            if (i<1){
                break;// exits the loop immedietly
            }
            System.out.println("Hello Batch 21");

        }
        System.out.println("=======================");

        Scanner input =new Scanner(System.in);
        for (int i=0;i==0;){
            System.out.println("Enter two number: ");
            int n1=input.nextInt();
            System.out.println("Enter math operator:");
            char op=input.next().charAt(0);
            int n2= input.nextInt();


            switch (op){
                case '+':
                    int add=n1+n2;
                    System.out.println("result: "+add);
                    break;
                case '-':
                    int minus=n1-n2;
                    System.out.println("result: "+minus);

                    break;
                case '%':
                    int rem=n1%n2;
                    System.out.println("result: "+rem);

                    break;
                case '/':
                    int div=n1/n2;
                    System.out.println("result: "+div);

                    break;
                case '*':
                    int mult=n1*n2;
                    System.out.println("result: "+mult);

                    break;
                default:
                    System.err.println("Invalid operator!");
            }




            System.out.println("would you like to continue? Yes, No");
            String answer= input.next();

            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using our calculator");
                break;
            }




        }


    }
}

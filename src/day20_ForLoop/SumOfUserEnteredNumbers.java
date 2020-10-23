package day20_ForLoop;

import java.util.Scanner;

public class SumOfUserEnteredNumbers {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int result=0;//5
        for (int i=1;i<=5;i++){
            System.out.println("Enter a number: ");
            int n=input.nextInt();
            result+=n;
        }
        System.out.println("result: "+result);


        System.out.println("=================");



        /*
        System.out.println("Enter a number");
        int n1= input.nextInt();

        System.out.println("Enter a number");
        int n2= input.nextInt();

        System.out.println("Enter a number");
        int n3= input.nextInt();

        System.out.println("Enter a number");
        int n4= input.nextInt();

        System.out.println("Enter a number");
        int n5= input.nextInt();

        int result=n1+n2+n3+n4+n5;
        System.out.println("Sum: "+result);
*/

    }
}

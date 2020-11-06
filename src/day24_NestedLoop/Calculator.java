package day24_NestedLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;

        while(true){
            System.out.println("Enter a number");
            int n1 = scan.nextInt();

            System.out.println("Enter a number");
            int n2 = scan.nextInt();

            result = n1 + n2;
            System.out.println("result = " + result);

            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            if(a.equals("no")){
                break;
            }

        }

    }
}

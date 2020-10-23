package day20_ForLoop;

import java.util.Scanner;

public class SumOfUserEnteredNumbers2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("How many times do you want to input: ");
        int times= input.nextInt();//howmany times

        int result=0;//5


        for (int i=1;i<=times;i++){
            System.out.println("Enter number "+i+" :");
             result+=input.nextInt();
        }
        System.out.println("result: "+result);

    }
}

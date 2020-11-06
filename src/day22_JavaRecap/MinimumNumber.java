package day22_JavaRecap;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int min=2147483647;
        for (int i=1;i<=5;i++) {//user is most likely to enter a number that's smaller than 2147483647
            System.out.println("Enter a number"+i+": ");
            int n = input.nextInt();
            if (n<min){
                min=n;
            }

        }
        System.out.println("minimum number is..."+min);



    }
}

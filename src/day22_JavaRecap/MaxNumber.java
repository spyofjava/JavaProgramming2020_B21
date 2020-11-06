package day22_JavaRecap;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int max=-99999999;
        for (int i=1;i<=5;i++) {//-2147483648
            System.out.println("Enter a number"+i+": ");
            int n = input.nextInt();
            if (n>max){
                max=n;
            }

        }
        System.out.println("maximum number is..."+max);




    }
}

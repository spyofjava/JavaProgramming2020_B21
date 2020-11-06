package day22_JavaRecap;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int max=-2147483648;
        int min=2147483647;

        for (int i=1;i<=5;i++){
            System.out.println("Enter a number: ");
            int n= input.nextInt();
            if (n>max){
                max=n;
            }
            if (n<min){
                min=n ;
            }
        }
        input.close();

        System.out.println("maximum number is..."+max);
        System.out.println("minimum number is..."+min);

    }
}

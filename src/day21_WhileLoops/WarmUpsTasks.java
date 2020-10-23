package day21_WhileLoops;

import java.util.Scanner;

public class WarmUpsTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int result = 0;

        for (int j = 0; j < 1; ) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if (num < 0) {
                break;
            }else {
                result+=num;
            }
            System.out.println(result);


        }


    }
}
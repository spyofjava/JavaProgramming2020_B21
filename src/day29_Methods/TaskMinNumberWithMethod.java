package day29_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class TaskMinNumberWithMethod {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Give 5 number: ");
        int[] number=new int[5];
        for (int i = 0; i < 5; i++){
            number[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(number));
        MinNumber(number);


    }
    public  static void MinNumber(int [] number){
        int min=number[0];
        for (int i=0;i<number.length;i++){

            if (min>number[i]){
                min=number[i];
            }
        }
        System.out.println("Min Number: "+min);
    }
}

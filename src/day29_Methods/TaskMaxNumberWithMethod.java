package day29_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class TaskMaxNumberWithMethod {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int[] number=new int[5];
        for (int i=0;i<5;i++){
            number[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(number));
        MaxNumber(number);
    }
    public static void MaxNumber(int[] number){
        int max=number[0];
        for (int i=0;i<number.length;i++){
            if (max<number[i]){
                max=number[i];
            }
        }
        System.out.println("Max Number: "+max);
    }
}
/*

task:
    1. create a function that can print out the maximum number from any given integer array
    2. create a function that can print out the minimum number from any given integer array
    3. create a function that can print the unique elements from the array


 */
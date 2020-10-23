package day14_Switch_Recap;

import java.util.Scanner;

public class bos {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();
        //DO NOT CHANGE ABOVE CODE!  Write your code below:
        String result;

        result=(num>0)? num+" is positive":(num<0)? num+" is negative":"no output for zero";
        System.out.println(result);


    }
}

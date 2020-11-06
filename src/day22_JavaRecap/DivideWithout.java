package day22_JavaRecap;

import java.util.Scanner;

public class DivideWithout {
    public static void main(String[] args) {

        /*
        Write a program that will verify if word contains in the sentence. Print out the result as boolean value.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Sentense: ");
        String word=input.nextLine();


        String count=""+word.contains(" ");
        System.out.println(count);


    }
}

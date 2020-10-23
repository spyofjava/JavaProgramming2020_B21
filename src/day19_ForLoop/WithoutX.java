package day19_ForLoop;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        //=================   Task2   ============================

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word= input.nextLine();

        if (word.toLowerCase().startsWith("x")){
            System.out.println(word.substring(1));
        }else {
            System.out.println(word);
        }

        System.out.println("===============================");


        char firstChar=word.charAt(0);
        String c=word.substring(1);
        if (firstChar=='x'){
            System.out.println(c);
        }else {
            System.out.println(word);
        }


        System.out.println("===============================");


        String s1=word.substring(0,1);// ending index is excluded

        if (s1.equalsIgnoreCase("x")){
            System.out.println(word.substring(1));
        }else {
            System.out.println(word);
        }

        System.out.println("===============================");





    }
}

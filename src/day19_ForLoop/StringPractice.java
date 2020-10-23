package day19_ForLoop;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string");
        String word= input.nextLine();

        if (word.isEmpty()){
            System.out.println("String is empty");
        }else if (word.length()>3){//more then 3 character
            System.out.println(word.substring(word.length()-3));// write 3 characters
        }else {
            System.out.println(word);

        }



    }
}
/*
        write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */
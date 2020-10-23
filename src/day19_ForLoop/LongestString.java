package day19_ForLoop;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your first number: ");
        String s1= input.nextLine();

        System.out.println("Enter your second number: ");
        String s2= input.nextLine();

        if (s1.length()>s2.length()){
            System.out.println(s1);
        }else if (s2.length()>s1.length()){
            System.out.println(s2);
        }else {
            System.out.println("Both are equal");
        }



    }

}
/*
1. write a program that can return the longest string frow two suer inputs
    2. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
    3. Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
    4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:      print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

    5. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
    6. ask the user to enter a word.
        if the word ends with "ly", print "really???"
        otherwise, print "never mind"

 */
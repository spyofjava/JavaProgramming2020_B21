package day19_ForLoop;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = input.nextLine();

        if (word.isEmpty()) {
            System.out.println("String is empty");
        } else if (word.length() > 3) {//more then 3 character
            System.out.println(word.substring(word.length() - 3));// write 3 characters
        } else {
            System.out.println(word);

        }


    }}
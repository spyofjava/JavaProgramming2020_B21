package day21_WhileLoops;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        int characternumber=word.length();

        if (characternumber%2!=0){
            int numberofmiddle=(characternumber+1)/2;
            char middleLetter=word.charAt(numberofmiddle-1);
            System.out.println("middle letter is : "+middleLetter);

        }else {
            int numberofmiddle=(characternumber)/2;
            char middleLetter1=word.charAt(numberofmiddle-1);
            char middleLetter2=word.charAt(numberofmiddle);
            System.out.println("middle 2 letter are : "+middleLetter1+middleLetter2);

        }

        String word1="javav;";//3/2
        //javav               //5/2=2
        if (word1.length()%2!=0) {
            if (word1.length() >= 3) {//first req.
                System.out.println(word1.charAt(word1.length() / 2));
            } else  {// 2nd req.
                System.out.println(word1 + word1 + word1);
            }
            // java  ==> 1,2
            // apples ==> 2,3

            if (word1.length()>=4){
                int m=word1.length()/2;
                System.out.println(word1.charAt(m-1)+""+word1.charAt(m));
            }else {
                System.out.println(word1+word1);
            }


        }
    }
}

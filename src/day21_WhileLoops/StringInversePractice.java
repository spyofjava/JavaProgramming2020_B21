package day21_WhileLoops;

import java.util.Scanner;

public class StringInversePractice {
    public static void main(String[] args) {

/*
        Scanner input=new Scanner(System.in);
        String word= input.nextLine();

        for (int i=word.length();i>0;i--){
            String newword=word.substring(i-1,i);
            System.out.print(newword);
        }
*/

        System.out.println("========================\n\n");


        Scanner input=new Scanner(System.in);
       System.out.print("Enter a string:");
        String word= input.nextLine();

        String reverseword="";
        int lastindex=word.length()-1;
        for (int i=lastindex;i>=0;i--){
//              System.out.print(word.charAt(i));
         reverseword+=word.charAt(i);
         }
         System.out.print(reverseword);

          boolean ispalindrome=word.equals(reverseword);
          System.out.println(ispalindrome);




    }
}

package day17_Strings;

import java.util.Scanner;

public class StringReview {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);// make the scanner object
        System.out.println("pick a number from 1-10");
        byte num =input.nextByte();//

        if (num>0 && num<11 ) {


            System.out.println("Can you enter that number as a word");
            String word = input.next();//accept one word

            boolean areMatching=false;
                switch (word){

                    case "one":
                        areMatching=(num==1);
                    break;
                    case "two":
                        areMatching=(num==1);
                    break;
                    case "three":
                        areMatching=(num==1);
                    break;
                        //case four--ten

                }
                        if(areMatching) {

                             System.out.println("Number: " + num);
                             System.out.println("word " + word);

                        }
                         else {
                                System.out.println(" The two inputs do not match");
                        }


        }
        else {
            System.out.println(num+" was not between 1 - 10");
        }


        input.close();





    }
}

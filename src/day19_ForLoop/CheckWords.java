package day19_ForLoop;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter first word");
        String s1= input.next();

        System.out.println("Enter second word");
        String s2= input.next();

        System.out.println("Enter third word");
        String s3= input.next();

        int l1=s1.length();
        int l2=s2.length();
        int l3=s3.length();

        input.close();

        if (l1==l2 && l1==l3){
            System.out.println("All words are same length");
        }else if (l1==l2||l1==l3){
            System.out.println("Not Same or Different lengths ");
        }else {
            System.out.println("All words are Different length");
        }

    }
}

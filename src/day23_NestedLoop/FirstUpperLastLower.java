package day23_NestedLoop;

import java.util.Scanner;

public class FirstUpperLastLower {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        String word= input.nextLine();
        input.close();

        char f=word.charAt(0);
        char l=word.charAt(word.length()-1);

        boolean start= f>='A' && f<='Z';// f>=65 && f<=90
        boolean end=l>=97 && l<=122;

        if (start&&end){
            System.out.println("True");
        }else {
            System.out.println("False");
        }






    }
}

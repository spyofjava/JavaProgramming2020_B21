package day20_ForLoop;

import java.util.Scanner;

public class free {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();


        String w1=word.substring(0,word.length());
        String w2="";
        for (int i =0;i<=sentence.length()-word.length();i++) {
            w2=sentence.substring(0+i,word.length()+i);
            if (w1.equals(w2)){
                System.out.println("it was found "+"\""+word+"\"");
            }
        }


    }
}

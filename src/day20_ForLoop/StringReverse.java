package day20_ForLoop;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        String s="ABCD";
        //0123
        String result="";//we want to contain the expected result which is the reversed version of str

        //   3
        for (int i=s.length()-1; i>=0;i--){//   i:  3 , 2
            result+=s.charAt(i);//D C
        }
        System.out.println(result);

        //===================================
//        Scanner input =new Scanner(System.in);
//        String str= input.nextLine();//abc
//                    //"cba
//        String b="";
//        for (int i=str.length()-1;i>=0;i--){
//            char a =str.charAt(i);
//            b+=a;
//        }
//        System.out.println(b);


        //=========================


    }
}

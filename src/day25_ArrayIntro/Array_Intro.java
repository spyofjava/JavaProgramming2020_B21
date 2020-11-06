package day25_ArrayIntro;

public class Array_Intro {
    public static void main(String[] args) {

        String name1="Azad";//,"Muhtar"; //we cant add more then 1 string in a variable
        String name2="Ayse";
        String name3="Inna";
        String name4="Erjon";
        String name5="Aysel";
        String[] names={"Azad","Ayse","Inna","Erjon","Aysel"};
        //                 0    1       2       3       4


        System.out.println(names[2]);

        String str1=names[0];
        System.out.println(str1);

        int[] score={80,85,90, 70,75,77,87,97,88};
        //            0  1  2  3  4  5  6  7  8

        //Erjon: 70
        System.out.println(names[0]+" : "+score[0]);
        System.out.println(names[1]+" : "+score[1]);
        System.out.println(names[2]+" : "+score[2]);
        System.out.println(names[3]+" : "+score[3]);
        System.out.println("=========================================");

        for (int i=0;i<=4;i++){// i: 0,1,2,3,4,5,6,7,8
            System.out.println(names[i]+" : "+score[i]);
        }




    }
}

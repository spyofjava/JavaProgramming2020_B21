package day23_NestedLoop;

import java.awt.datatransfer.StringSelection;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence="Java is a programming language, I like to learn Java";
        String word="=Java";

        int count=0;

        while (sentence.contains(word)){
            sentence=sentence.replaceFirst(word,"");//we need to remove one at a time to count
            count++;
        }
        System.out.println(count);
        System.out.println(sentence);


        System.out.println("======================================================================");






    }
}
/*
Warmup task:
    1. write a program that can return the frequncy of the a word from the sentence
        Ex:
            sentence = "Java is a programming language, I like to learn Java";
            word = "Java";
            output:
                2
    2.  Write a program that asks user to enter a string. If string started with uppercase and ends with lowercase letter then print true, otherwise print false
        Ex:
           Input: Cybertek
           output: true
           Input: CyberteK
           output: false
Collapse



 */
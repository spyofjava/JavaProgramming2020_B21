package day31_MethodOverLoading;

import library.StringUtility;

public class FrequeencyOfWord {
    public static void main(String[] args) {

        String str="Java java java jAvA c# C# python python";
        String word="java";

        int r= StringUtility.frequencyOfWord(str,word);
        int countCsharp=StringUtility.frequencyOfWord(str,"c#");
        System.out.println("count java: "+r);
        System.out.println("Count c#: "+countCsharp);

        System.out.println("==================");

        String sentence=" dog odg dog dgo Dog dog DOG dOG cat cat cat cat";
        int  countdog=StringUtility.frequencyOfWord(sentence,"dog");
        int countcat=StringUtility.frequencyOfWord(sentence,"cat");

        System.out.println("dog: "+countdog);
        System.out.println("cat: "+countcat);



    }



}

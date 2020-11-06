package day26_ArraysContinue;

import java.util.Arrays;

public class UniqueWords {
    public static void main(String[] args) {

        String[] words={"C#","Java","C#","Python","Ruby","Swift","C++","Swift"};

        String words1=Arrays.toString(words);
        String nonDup=words[0];
        int count=0;

        for (int i=0;i<words.length;i++){
            if (words1.contains(words[0])) {
                count++;
                words1 = words1.replaceFirst(words[0], "");
            }
        }
        System.out.println(count);
        System.out.println(words1);


    }
}

package day23_NestedLoop;

public class CatAndDog {
    public static void main(String[] args) {
        String sentence="Dog dog Dog dog Cat cat cat CAt";
        String word="Cat";
        word=word.toLowerCase();
        String word2="Dog";
        word2=word2.toLowerCase();


        String temp=sentence.toLowerCase();//
        int countdog=0;
        int countcat=0;

        while (temp.contains(word)){
            temp=temp.replaceFirst(word,"");
            countcat++;

        }




        while (temp.contains(word2)){
            temp=temp.replaceFirst(word2,"");
            countdog++;
        }
        System.out.println(countdog);


        if (countcat==countdog){
            System.out.println(countcat==countdog);
        }else {
            System.out.println(countcat == countdog);
        }





    }

}


package day17_Strings;

public class StringMutability {
    public static void main(String[] args) {

        String wordOne="Friday";//w1=friday
        String wordTwo=wordOne;//w2=friday
        String wordThree="Monday";//w3=mon
        wordOne="Monday";//w1=monday

        System.out.println(wordTwo);//friday
        System.out.println(wordOne);//monday
        System.out.println(wordOne==wordThree);//monday=monday--->true
        System.out.println(wordOne==wordTwo);//mon=fri



    }
}

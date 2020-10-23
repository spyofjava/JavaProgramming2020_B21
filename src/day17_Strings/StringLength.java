package day17_Strings;

public class StringLength {
    public static void main(String[] args) {

        String s=";kjhad;fgjh;auryrg;jandf;bvjlh;adlfjvbh;jdhfb;jlhd;fbjkh;djfhb";
        String s2="word";


        System.out.println(s.length());// 62
        System.out.println(s2.length());//4
        int len=s.length();
        System.out.println(len==s2.length());//45==4-->false
        System.out.println(len==s.length());//45=45--->true








    }
}

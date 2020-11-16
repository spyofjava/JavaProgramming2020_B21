package day30_ReturnMethods;

public class UnduplicatedString {
    public static void main(String[] args) {


        String str="aaaaabbbbbccccccccccccc";
        withoutDuplicate(str);

    }

    public static void  withoutDuplicate(String str){
        String result="";//"abc"
/*
        for (String each: str.split("")){//each:[a,a,b,c,c,b]
            if (!result.contains(each)){
                result+=each;
            }
        }
        System.out.println(result);
 */
        for (int i=0;i<str.length();i++){//each:[a,a,b,c,c,b]
            if (!result.contains(""+str.charAt(i) )){
                result+=""+str.charAt(i);
            }
        }
        System.out.println(result);


    }




}

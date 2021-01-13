package day20_ForLoop;

public class Empty3 {

    public static void main(String[] args) {

        String str = "aasddddf";
        String result="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (!result.contains(str.charAt(i)+"")){
                result+=ch;
            }
        }
        System.out.println(result);



    }
}

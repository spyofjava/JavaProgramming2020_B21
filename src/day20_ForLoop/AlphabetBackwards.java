package day20_ForLoop;

public class AlphabetBackwards {
    public static void main(String[] args) {

        for (int i=90;i>=65;i--){
            System.out.print((char)i+" ");
        }

        System.out.println("\n\n");


        for (int i=122;i>=97;i--){
            System.out.print((char)i+" ");
        }

        System.out.println("\n\n");


        for (char i='z';i>='a';i--){
            System.out.print((char)i+" ");
        }

    }
}

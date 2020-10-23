package day20_ForLoop;

public class Alphabet {
    public static void main(String[] args) {
        for (int i=65;i<=90;i++){
            System.out.println((char)i);
        }

        for (int i=65;i<=90;i++){
            System.out.print((char)i+" ");
        }

        System.out.println("\n\n\n");
        for (char k='A';k<='Z';k++){
            System.out.print(k+" ");
        }

        //~~~~~~~~~~~   a to z ~ 97--122   ~~~~~~~~~~~
        System.out.println("\n\n\n");
        for (int j=97;j<=122;j++){
            System.out.print((char)j+" ");
        }

        System.out.println("\n");
        for (char h='a';h<='z';h++){
            System.out.print(h+" ");
        }
    }
}

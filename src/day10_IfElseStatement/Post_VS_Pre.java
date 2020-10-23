package day10_IfElseStatement;

public class Post_VS_Pre {
    public static void main(String[] args) {
        // pre:
        double x = 7; //7

        System.out.println( ++x ); // 8.0
        System.out.println(x); // 8.0

        System.out.println(--x); // 7.0
        System.out.println(x); //7.0

        System.out.println("============================");
        // post:

        double y = 7; // 8.0

        System.out.println(y++); //7.0
        System.out.println(y); //8.0

        System.out.println(y--); //8.0
        System.out.println(y); // 7.0

        float    a   =  100.987_6543f;

        short  b  =  (byte) a ;

        byte  c   = (byte) b;
        System.out.println(c);
        Long h=100000000l;

        long m=(long)h;
    }
}

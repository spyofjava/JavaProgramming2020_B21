package DailyExercise.MethodsReview;

public class empty2 {

    public static void main(String[] args) {

        int a;
        double b=216.54;

        a= (int) b;
        System.out.println("a="+a);
        long c;
        c= (long) b;
        System.out.println("c="+c);
        short d;
        float f=25.675f;
        byte h= (byte) f;
        System.out.println("h="+h);

        f= (float) b;
        System.out.println("f="+f);
        b=a;
        c=a;
        //d=a; error
        d=(short)a;
        System.out.println("d="+d);
        f=a;
       // h=a; error
        h=(byte)a;
        System.out.println("h="+h);
    }
}

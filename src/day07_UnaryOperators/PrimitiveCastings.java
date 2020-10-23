package day07_UnaryOperators;

public class PrimitiveCastings {
    public static void main(String[] args) {
        double x = 2.5;
        double y = x;//int y !=double x
        // double>float>long>int>short>byte

        double a=2.5;
        int b=(int)a;//convert to double a to int a

        long l=100;
        short s= (short)l;

        double f=503.4;
        float j= (float) f;

        System.out.println(b);

        double d=20.5;
        float k= (float) d;
        //for mac hold option+enter

        short q=400;
        byte t= (byte) q;//-128<=byte<127
        System.out.println(t);//the value 400 is out of Byte ' range, and casting does not change the limit of data







    }
}

package day40_Constructor;

public class ConstructorIntro {
    static int b = 200;

    static {
         b=200; //1
    }
    public ConstructorIntro(int a) {
        System.out.println("Constructor with int arg");
        b = 200;//50
        this.a = a;
    }


    int a ;

    public static void main(String[] args) {

        System.out.println("Hello");
        //System.out.println(a);

        int num = new ConstructorIntro(10).a;

        ConstructorIntro obj2 = new ConstructorIntro(100);
    }
}

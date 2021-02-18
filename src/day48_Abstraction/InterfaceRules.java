package day48_Abstraction;

public interface InterfaceRules {

    public static final int a = 100; // public static final  by default
    int b = 200;

    //  static{ }


    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(InterfaceRules.a);

        //  a = 100; by default it's final

    }

    void method2();

    public default void m(){ }

     static void mm(){

    }

}


class cccc{

    public static void main(String[] args) {

        System.out.println("---------------------");
        System.out.println(InterfaceRules.a);


    }

}
/*
Interface: cannot have objects
What we can have:
    variables: public static and final by default
    methods: abstract method
            static methods
            default method
what we cannot have:
    constructor
    instance methods
    instance variables
    blocks
 */
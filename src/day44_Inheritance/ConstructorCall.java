package day44_Inheritance;

class A{

    public A(){
        System.out.println("A");
    }

}

class B extends A{

    public B(){// A B
        //super();
        System.out.println("B");
    }
}

public class ConstructorCall extends A{

    public ConstructorCall(){
        super(); //A B
        //System.out.println("C");
    }

    public static void main(String[] args) {
        //new B();
        new ConstructorCall();
    }

}

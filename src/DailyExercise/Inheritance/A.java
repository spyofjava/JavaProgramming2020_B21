package DailyExercise.Inheritance;

class A {
    public A() {
        System.out.println("merhaba class A");
    }

}

class B extends A{
    public B() {
        super();
        //System.out.println("merhaba class B");
    }
}

class C extends B{
    public C() {
        super();
        //System.out.println("merhaba class C");
    }
}

class D extends C{
    public D() {
        super();
        //System.out.println("merhaba class D");
    }
}


class E {
    public static void main(String[] args) {
        System.out.println("-----------Step  I -----------------");
        A a=new A();
        System.out.println(a);


        System.out.println("\n-----------Step II-----------------");
        B b=new B();
        System.out.println(b);


        System.out.println("\n-----------Step III----------------");
        C c=new C();
        System.out.println(c);


        System.out.println("\n-----------Step IV----------------");
        D d=new D();
        System.out.println(d);

        System.out.println("\n-----------Step IV----------------");

        E e=new E();
        System.out.println(e);
    }
}
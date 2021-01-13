package DailyExercise.Inheritance;

class A {
    public static String name="Ibrahim";
    public  String jobtitle;
    public int age;

    public A() {

        name="mehmet";
        System.out.println("name: "+name);

    }


}

class B extends A{


    public B() {
        super();
    }
}

class C {
    public static void main(String[] args) {

        A a=new A();
        a.age=12;

        System.out.print(a.age);
        System.out.println(a);

        //   ∫ß®åhîm
    }
}
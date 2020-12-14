package day41_Encapsulation;
///////////////////////////////////////  ----  2  ----  /////////////////////////
public class Test {

    public static void main(String[] args) {
        System.out.println(Data.publicVariable);
        //    System.out.println(Data.privateVariable);
        System.out.println(Data.defaultVariable);

        Data obj = new Data();

        Data.publicMethod();
        //  Data.privateMethod();
        Data.defaultMethod();

    }

}


class Test2{

}

class Test3{

}

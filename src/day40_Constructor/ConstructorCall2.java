package day40_Constructor;

public class ConstructorCall2 {

    public ConstructorCall2(){
        // this(); // cannot call itself
        // this(10); // calling int
        System.out.println("default");
    }

    public ConstructorCall2(int a){
        this(); // calling default
        System.out.println("int");
    }

    public static void main(String[] args) {
        ConstructorCall2 a=new ConstructorCall2(3);
    }



}
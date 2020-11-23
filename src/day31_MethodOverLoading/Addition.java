package day31_MethodOverLoading;

public class Addition {
    public static void main(String[] args) {

        System.out.println(AdditionOf2Numbers(200,600));
        System.out.println(AdditionOf3Numbers(40,62,80));
        System.out.println(AdditionOf4Numbers(10,20,30,40));


    }


    public static int AdditionOf2Numbers(int a,int b){
        return a+b;
    }

    public static int AdditionOf3Numbers(int a,int b,int c){
        return a+b+c;
    }

    public static int AdditionOf4Numbers(int a,int b,int c,int d){
        return AdditionOf2Numbers(a,b)+AdditionOf2Numbers(c,d);
    }
}

package day11_MultiBranchIf;

public class Ternary_shortcutOfIfElse {
    public static void main(String[] args) {

        int s=70;
        String h=(s%2==0) ? s+" is Even\n":s+" is Odd\n";

        String k=(s%3==0) ? s+" is divisible by 3" : "Not divide by 3";
        System.out.println(h+k);

        System.out.println("=================================");

        int n1=15;
        int n2=30;
        String result=(n1<n2) ? n2+" is max number" : n1+" is max number";
        System.out.println(result);

        System.out.println("=================================");

        int r1=15;
        int r2=30;
        String result2=(n1<n2) ? n1+" is min number" : n2+" is min number";
        System.out.println(result2);


        System.out.println("=================================");


        int f1=85;
        int f2=360;
        int f3=56;
        boolean sd= f1>f2 && f1>f3;
        boolean sf= !sd && f2>f3;
        String result4=(sd) ? f1+" is max number" : (sf) ? f2+" is max number":  f3+" is min number";
        System.out.println(result4);



        System.out.println("=================================");



        int t1=85;
        int t2=360;
        int t3=56;
        boolean x= t1<t2 && t1<t3;
        boolean y= !sd && t2<t3;
        String result3=(x) ? f1+" is min number" : (y) ? f2+" is min number":  f3+" is min number";
        System.out.println(result3);




    }
}

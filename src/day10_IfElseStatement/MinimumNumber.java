package day10_IfElseStatement;

public class MinimumNumber {
    public static void main(String[] args) {

        int n1=21;
        int n2=3;
        int n3=1;

        boolean n3ismin=n3<n1&&n3<n2;
        boolean n2ismin=n2<n1&&n1<n3;
        boolean n1ismin=!n3ismin&&!n2ismin;

        int min=0;
        if(n3ismin){
            min=n3;

        }
        if(n2ismin){
            min=n2;

        }
        if(n1ismin){
            min=n1;
        }
        String srt=" is min number";
        System.out.println(min+srt);


        /*boolean n1ismin=n1<n2 && n1<n3;
        boolean n2ismin=!n1ismin && n2<n3;
        boolean n3ismin=!n1ismin&& n2ismin;

        if(n1ismin){
            System.out.println(n1+" is a minimum number");

        }
        if (n2ismin){
            System.out.println(n2+" is a minimum number");
        }

        if(n3ismin){
            System.out.println(n3+" is a minimum number");
        }


         */




    }
}

/*
Task01: ValidTriangle
         A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that declares three integers as angles and check whether a triangle is valid or not.

Task02: MaximumNumber
         write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)

Task03: MinimumNumber
         write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)


 */
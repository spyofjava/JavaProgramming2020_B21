package day09_IfStatement;

public class MaximumMinimum {
    public static void main(String[] args) {
        int n1 =300;
        int n2 = 4;

        // maximum:
        boolean n1IsMax = n1 > n2;  // n1 to be the maximum number
        boolean n2IsMax = n2 > n1; // n2 to be the maximum number

        if(n1IsMax){
            System.out.println(n1 +" is maximum");
        }

        if(n2IsMax){
            System.out.println(n2+" is maximum");
        }


        // minimum:
        boolean n1IsMin = n1 < n2; // n1 is the minimum number
        boolean n2IsMin = n2 < n1;  // n2 is the minimum number

        if(n1IsMin){
            System.out.println(n1+" is minimum");
        }

        if(n2IsMin){
            System.out.println(n2+" is minimum");
        }


        // equal:

        boolean equal =   n1 == n2 ;  // n1 is equal to n2
        //!n1IsMax && !n2IsMax

        if(equal){
            System.out.println("Both are equal");
        }



    }
}

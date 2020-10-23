package day11_MultiBranchIf;

public class LargestNumber {
    public static void main(String[] args) {

        int n1=7000;
        int n2=600;
        int n3=1500;

        boolean n1ismax=n1>n2 && n1>n3;
        boolean n2ismax=!n1ismax && n2>n3;

        if(n1ismax){
            System.out.println(n1+" is the max number");
        }
        else  if (n2ismax){
            System.out.println(n2+" is the max number");
        } else {
            System.out.println(n3+" is the max number");
        }




        /*
        if(n1>n2&&n1>n3){
            System.out.println(n1+" is the max number");
        }
        else  if (n2>n1 && n2>n3){
            System.out.println(n2+" is the max number");
        } else {
            System.out.println(n3+" is the max number");
        }

         */



    }
}

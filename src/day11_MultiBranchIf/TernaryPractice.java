package day11_MultiBranchIf;

public class TernaryPractice {
    public static void main(String[] args) {
        int n=100;
        String result="";


        if (n%2==0){
            result="Even";
        }
        else {
            result="Odd";
        }

        System.out.println(result);

        System.out.println("==========================");

        String result2=(n%2==0) ? "Even" :"Odd";
        System.out.println(result2);


        System.out.println("==========================");

        int personAge=38;
        String buyAlcohol=(personAge>=21) ? "Eligible to buy Alcohol" : "Not eligible to buy Alcohol";
        System.out.println(buyAlcohol);


        System.out.println("==========================");



        int number=60;

        String s1=(number>0) ? "Positive" :  (number<0) ? "Negative":"Zero";
        System.out.println(s1);


    }
}

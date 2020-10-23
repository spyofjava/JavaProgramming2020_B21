package Day15_Scanner;

import java.util.Scanner;

public class Scanner_EvenOddNumber {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("number 1: ");
        int n1=scanner.nextInt();
        System.out.println("number2 ");
        int n2= scanner.nextInt();

        String b=(n1%2==0)? n1+" is even number":n1+" id odd number";

        System.out.println(b);




    }
}

package day16_Scanner;

import java.util.Scanner;

public class ScannerClose {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        input.close();// after closing we cannot use the scanner
        System.out.println(input.next());//this gives exception when running, because



    }
}

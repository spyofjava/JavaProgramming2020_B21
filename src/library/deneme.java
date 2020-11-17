package library;

import java.util.Arrays;
import java.util.Scanner;

public class deneme {


    public static int max(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

    public static int Faktorial() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        System.out.print(num + "!= ");
        int result = 1;
        for (int i = (int) num; i >= 1; i--) {
            if (i > 1) {
                System.out.print(i + ".");
            } else {
                System.out.print(i + "= ");
            }

            result *= i;
        }
        return result;

    }

    public static int total(int a, int b) {
        int result = a + b;
        return result;
    }

    public static double average() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number do you want to give?: ");
        int howmanynumber = scanner.nextInt();
        int[] numbers=new int[howmanynumber];
        for (int i=0;i<howmanynumber;i++){
            numbers[i]+=scanner.nextInt();
        }
        int total=0;
        for (int each:numbers){
            total+=each;
        }
        double average=total/howmanynumber;
        return average;

    }

    public static String reverse(String str){
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        return reverse;
    }

    public static int [] decending(int []arr){
        int[] decend=new int[arr.length];
        for (int i=arr.length-1,j=0;i>=0;j++,i--){
            decend[j]=arr[i];
        }
        return decend;
    }
}

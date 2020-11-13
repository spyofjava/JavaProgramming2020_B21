package day29_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Task3UniqueNumberWithMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give 5 numbers: ");
        int[] number = new int[5];
        for (int i = 0; i < 5; i++) {
            number[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(number));
        uniqueNumber(number);


    }

    public static void uniqueNumber(int number[]) {

        for (int i = 0; i < number.length; i++) {
            int element = number[i];
            int count=0;
            for (int j = 0; j < number.length; j++) {
                if (element == number[j]) {
                    count++;
                }
            }
            if (count==1){
                System.out.print(number[i]+" ");
            }
        }


    }
}

package DailyExercise.Nov_17;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfMergedArray {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int[] num1 = {1, 2};
        int[] num2 = {4, 3};
        int totallength = num1.length + num2.length;
        int[] merged = new int[totallength];
        for (int i = 0; i < num1.length; i++) {
            merged[i] = num1[i];
        }
        for (int j = num1.length, i = 0; j < totallength; i++, j++) {
            merged[j] = num2[i];
        }
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));

        if (totallength % 2 != 0) {
            int index = totallength / 2;
            System.out.println("merged array= " + Arrays.toString(merged) + " and median is " + merged[index]);
        } else {
            int index = totallength / 2;
            double x = merged[index - 1];
            double y = merged[index];
            double median = (x + y) / 2;
            System.out.println(median);
            System.out.println("merged array= " + Arrays.toString(merged) + " and median is " + median);
        }
    }
}

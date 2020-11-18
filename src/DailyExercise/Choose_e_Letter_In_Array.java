package DailyExercise;

import java.util.Arrays;

public class Choose_e_Letter_In_Array {
    public static void main(String[] args) {

        String[] arr = {"\"zero\"", "\"one\"", "\"two\"", "\"three\"", "\"four\"", "\"elkj\""};

        System.out.println(Arrays.toString(getWithE(arr)));


    }

    public static String[] getWithE(String[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("e")) count++;
        }

        String[] arr1 = new String[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("e")) arr1[j++] = arr[i];
        }

        return arr1;


    }
}

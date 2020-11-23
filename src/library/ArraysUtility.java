package library;

import java.util.Arrays;

public class ArraysUtility {

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

    public static int[] combineTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;

        for (int each : arr1) {
            arr3[i++] = each;
        }

        for (int each : arr2) {
            arr3[i++] = each;
        }

        return arr3;
    }

    public static int[] sort(int[] arr) {  // {2,1,3}
        Arrays.sort(arr);  // {1,2,3};
        int[] reversedArray = new int[arr.length];  // {3, 2, 1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }


        return reversedArray;
    }   // sorts in descending order

    public static String printArray(int[] arr) {
        String str = Arrays.toString(arr);
        str = str.replace("[", "{").replace("]", "}");
        return str;
    }

    public static int[] addElement(int[] array, int number) {
        int[] result = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {

            result[i] = array[i];
        }

        result[result.length-1]=number;
        return result;
    }

    public static double[] addElement(double[] array2, double number) {
        double[] result = new double[array2.length];

        for (int i = 0; i < array2.length; i++) {

            result[i] = array2[i];
        }

        result[result.length-1]=number;
        return result;
    }


}

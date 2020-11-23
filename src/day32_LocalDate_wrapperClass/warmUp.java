package day32_LocalDate_wrapperClass;

import library.ArraysUtility;

import java.util.Arrays;

public class warmUp {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6};
        double[] arr2={1.5,2.5,3.5,4.5,5.5,6.5};
        String [] arr3={"ali","veli","can"};
        char[] arr4={'a','b','c'};
        ArraysUtility.addElement(arr,7);
        ArraysUtility.addElement(arr2,7.5);
        ArraysUtility.addElement(arr3,"java");
        ArraysUtility.addElement(arr4,'x');

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }

    //                                  (1,2,3,4,5}    6
    /*
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
*/
}



/*
warmup task:
    1. create a return method called addElements that can add an Inteeger  after the  last index of an integer array
    2. create a return method called addElements that can add a double after the last index of a double array
    3. create a return method called addElements that can add a String after the last index of a String array
    4. create a return method called addElements that can add a char after last index of a char array

 */
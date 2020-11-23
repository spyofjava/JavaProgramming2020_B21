package day31_MethodOverLoading;

public class MethodOverloading3 {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        double[] arr1={1.5, 2.5, 3.5, 4.5};
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(max(arr1));
        System.out.println(min(arr1));



    }

    public static int max( int[] arr){
        int max=arr[0];
        for (int each:arr){
            if (each>max){
                max=each;
            }
        }
        return max;
    }

    public static int min(int [] arr){
        int min=arr[0];
        for (int each:arr){
            if (each<min){
                min=each;
            }
        }
        return min;
    }

    public static double max(double[] arr){
        double max=arr[0];
        for (double each:arr){
            if (each>max){
                max=each;
            }
        }
        return max;
    }

    public static double min(double[] arr){
        double min=arr[0];
        for (double each:arr){
            if (each<min){
                min=each;
            }
        }
        return min;
    }




}

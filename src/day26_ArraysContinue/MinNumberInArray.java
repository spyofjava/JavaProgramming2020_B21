package day26_ArraysContinue;

public class MinNumberInArray {
    public static void main(String[] args) {

        int[] numbers={1,2,-30,4,5,6,7};

        int min=numbers[0];
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]<min){
                min=numbers[i];
            }
        }

        System.out.println("Min: "+min);



    }
}

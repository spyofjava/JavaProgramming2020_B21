package day26_ArraysContinue;

public class MaxNumberInArray {
    public static void main(String[] args) {

        int[] numbers={-1,-2,-30,-4,-5,-6,-7};

        int max=numbers[0];
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>max){
                max=numbers[i];
            }
        }

        System.out.println("Max: "+max);

    }
}

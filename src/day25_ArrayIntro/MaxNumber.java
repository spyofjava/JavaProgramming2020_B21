package day25_ArrayIntro;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers={66645,1700,452965,9991326};
        int max=0;
        int endmax=0;
        int count=0;
        for (int i=0;i<=numbers.length-1;i++){
            for (int j=0;j<=numbers.length-1;j++){
                if (i!=j){
                    if (numbers[i]>numbers[j]){
                        count++;
                        if(count==3){
                            max=numbers[i];
                            System.out.println("Maximum Number is "+max);
                            break;
                        }
                    }
                }else{
                    continue;
                }
            }

            count=0;
        }

    }
}

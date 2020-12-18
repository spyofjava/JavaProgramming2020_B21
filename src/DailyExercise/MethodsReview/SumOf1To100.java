package DailyExercise.MethodsReview;

public class SumOf1To100 {


    public static void main(String[] args) {

        sum1To100();

    }


    public static void sum1To100(){
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);
    }



}

package DailyExercise.Nov_18;

public class Timer_Exercise {

    public static void main(String[] args) throws InterruptedException {


        int j = 10;
        for (int i = 10; i >= 0; i--) {

            System.out.print("\r" + i);
            Thread.sleep(300);
            System.out.print("\r" + " ");
            Thread.sleep(300);


            if (i == 0) {
                for (j = 0; j < 10; j++) {
                    for (int k = 0; k < j; k++) {
                        System.out.print( "*");
                        Thread.sleep(100);
                    }
                    System.out.println();
                }
            }
        }
    }



}

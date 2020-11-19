package DailyExercise.Nov_18;

import java.util.Scanner;

public class Timer2 {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner=new Scanner(System.in);
        int hours=scanner.nextInt();

        System.out.println("hr"+":"+"min"+":"+"sn");
        for (int k=hours-1;k>=0;k--) {
            for (int i = 59; i >= 0; i--) {
                for (int j = 59; j >= 0; j--) {
                    System.out.print("\r" +k+" : "+ i + " : " + j);
                    Thread.sleep(1000);
                    System.out.print("\r" +k+"   "+ i + "   " + j);
                    Thread.sleep(1000);
                }
            }
        }


    }
}

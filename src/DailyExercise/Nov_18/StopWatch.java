package DailyExercise.Nov_18;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Time limit:");
        int minutes = scanner.nextInt();

        for (int i = 0; i < minutes; i++) {
            for (int k = 0; k < 59; k++) {
                for (int j = 0; j < 100; j++) {
                    System.out.print("\r" + i + " : " + k + " : " + j);
                    Thread.sleep(10);
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.err.print("\r"+"End");
            Thread.sleep(1000);
            System.out.print("\r"+" ");
        }

    }
}

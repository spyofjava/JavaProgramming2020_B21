package Day27_ForEachLoop;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Minutes:");
        int minutes= input.nextInt();

        for (int i=minutes;i>=0;i--){

            for (int j=59;j>=0;j--){
                System.out.print("\r"+(i-1)+"minutes "+j+" seconds");
                Thread.sleep(1000);

            }



        }


    }
}

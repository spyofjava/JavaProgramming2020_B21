package day45_Exceptions;

import java.time.LocalDate;
import java.time.LocalTime;

public class EveryDaysLunchBreak {
    public static void main(String[] args) {


       // LocalTime currentTime= LocalTime.now();
        LocalTime currentTime= LocalTime.of(1,0);


        LocalTime lunchtime=LocalTime.of(1,0);

        if (currentTime.equals(lunchtime)){
            throw new LuchBreakException("Muhtar! we need to go Lunch!!!!");
        }else {
            System.out.println("Continue");
        }
    }
}

package day32_LocalDate_wrapperClass;

import java.time.LocalDate;
import java.time.LocalTime;

public class Date {
    public static void main(String[] args) {

        LocalDate yesterday = LocalDate.of(2020, 11, 22);

        System.out.println(yesterday);

        //LocalDate d1 = LocalDate.of(2019, 2, 29);
        // System.out.println(d1);

        System.out.println(  yesterday.isLeapYear() ); // Leap ==> true, otherwise ==> false

        LocalDate today = LocalDate.now();

        System.out.println(today);

        System.out.println(LocalTime.now());

        // LocalDate DofB



        //LocalDate  DofBirth

        String[] names={"Julia","inna","Anna","Ruslan","Livio"};
        LocalDate[] birthDays={
                LocalDate.of(1990,11,23),
                LocalDate.of(1995,02,10),
                LocalDate.of(2000,03,15),
                LocalDate.of(2005,04,20),
                LocalDate.of(2010,05,25),
        };

        for (int i=0;i< birthDays.length;i++){
            System.out.println(names[i]+" birthday is: "+birthDays[i]);
            System.out.println(names[i]+" was born on leap year: "+birthDays[i].isLeapYear());

        }


    }
}

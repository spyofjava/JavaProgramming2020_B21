package day20_ForLoop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class free {


    public static void main(String[] args) {
        System.out.println(simpleRoomBook(true,7,2,2018));
    }

    public static  boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate start=LocalDate.of(2018,7,1);
        LocalDate finish=LocalDate.of(2018,7,8);
        LocalDate date= LocalDate.of(year,month,day);

        String  b=start.format(dtf);
        System.out.println(finish.format(dtf));
        System.out.println(date.format(dtf));

        if (isAvailable==true) {
            if (date.isBefore(start) || date.isAfter(finish)) {
                return (true);
            } else {
                return (false);
            }
        }else {
            return false;
        }
    }
}

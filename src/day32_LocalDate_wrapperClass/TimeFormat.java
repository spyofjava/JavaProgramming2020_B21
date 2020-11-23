package day32_LocalDate_wrapperClass;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.zip.DataFormatException;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
    /*
    LocalDate:
        year: yyyy
        month: MM (number), MMM(three letters of month), MMMM(full name)
        days: dd
        name of day: E(three letters) , EEEE (full name)
        Month/ Day / Year
     */
    public static void main(String[] args) {
        //ofpattern
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy,EEEE");
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.format(df));
        System.out.println("=======================");

        //ofpattern
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(tf));
        System.out.println("=======================");

        // Of
        LocalTime t1 = LocalTime.of(23,35,55);
        System.out.println(t1);
        System.out.println(t1.format(tf));

        System.out.println("=======================");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd yyyy\nEEEE\nhh:mm a ");
        LocalDateTime dtf9 = LocalDateTime.now();
        System.out.println(dtf9);
        System.out.println(dtf9.format(dtf));
        System.out.println("=======================");
        DateTimeFormatter dtfn = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");
        LocalDateTime dtf1 = LocalDateTime.now();
        System.out.println(dtf1);
        System.out.println(dtf1.format(dtfn));
        System.out.println("=======================");


        // isBefore  isAfter
        LocalDate tomorrow = LocalDate.of(2020,11,24);
        System.out.println(tomorrow.format(df));
        boolean r1 = today.isBefore(tomorrow);
        boolean r2 = today.isAfter(tomorrow);

        System.out.println("=======================");

        //getYear Month Day Hour Minutes

        // calculate the age
                        //2020/11/23         2020
        int currentYear = LocalDate.now().getYear();
        LocalDate DofB = LocalDate.of(1983,5,29);
        int age=currentYear-DofB.getYear();
        System.out.println(age);


        //plusdays();
        System.out.println(DofB.plusDays(10));

        LocalDate rightNow = LocalDate.now();
        LocalDate holidayBreak = rightNow.plusDays(2);
        System.out.println(holidayBreak);

        System.out.println("=======================");

        //plusMinutes()
        LocalTime rigthnow = LocalTime.now();
        LocalTime LunchBreak = rigthnow.plusMinutes(15);
        System.out.println(LunchBreak.format(tf));

        System.out.println("=======================");


        LocalTime ClassStarts = LocalTime.of(10,00);
        LocalTime firstBreak = ClassStarts.plusMinutes(45);
        System.out.println("First Break: "+firstBreak.format(tf));

        LocalTime secondBreak = firstBreak.plusHours(1);
        System.out.println("Second Break: "+secondBreak.format(tf));

        LocalTime thirdBreak = secondBreak.plusHours(1).plusMinutes(15);
        System.out.println("Third Break: "+thirdBreak.format(tf));

        LocalTime afternoonClass = thirdBreak.plusHours(1).plusMinutes(15);
        System.out.println("Come back at: "+afternoonClass.format(tf));









    }
}

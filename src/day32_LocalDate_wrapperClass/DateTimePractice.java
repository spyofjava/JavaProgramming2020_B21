package day32_LocalDate_wrapperClass;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTimePractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first person' birth year, month, and day");
        LocalDate DofB1 = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println("Enter second person' birth year, month, and day");// B
        LocalDate DofB2 = LocalDate.of(input.nextInt(), input.nextInt(),input.nextInt());

        input.close();

        if (DofB1.isBefore(DofB2)){
            System.out.println("First person is older");
        }else if (DofB1.isAfter(DofB2)){
            System.out.println("Second person is older");
        }else{
            System.out.println("Same age");
        }


        //current age

        int age1 = LocalDate.now().plusYears(30).getYear()-DofB1.getYear();
        int age2 = LocalDate.now().plusYears(30).getYear()-DofB2.getYear();

//        //after 30 years
//
//        int after1 = age1+30;
//        int after2 = age2+30;

        System.out.println("After 30 years, pearson A will be: "+age1);
        System.out.println("After 30 years, pearson B will be: "+age2);


        //Method call
        LocalDate Dofb3 =  LocalDate.of(1980,12,5);
        System.out.println(calculatreAge(Dofb3,5));



    }

    public static int calculatreAge(LocalDate DofB,int year){
        return LocalDate.now().plusYears(year).getYear()-DofB.getYear();
    }
}

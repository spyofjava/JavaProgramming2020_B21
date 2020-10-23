package day05_AritmeticOperators;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstname="John";
        String lastname="Daniel";
        String fullname=firstname+" "+lastname;
        System.out.print("Employee full name is:");
        System.out.println(fullname);

        char gender='M';
        System.out.print(fullname);
        System.out.print("' Gender is: ");//for single characters
        System.out.println(gender);

        int age=35;
        String companyName="CapitalOne";
        System.out.print(fullname);
        System.out.print("' works at:");
        System.out.println(companyName);

        String jobtitle="SDET";
        System.out.print(fullname);
        System.out.print("'Job title is:");
        System.out.println(jobtitle);

        double salary=120000.0;
        System.out.print(fullname);
        System.out.print("' salary is: $");
        System.out.println(salary);

        boolean isFullTime= true;
        boolean isMaried= false;

        System.out.print(fullname);
        System.out.print("is full time employee:");
        System.out.println(isFullTime);


        System.out.print(fullname);
        System.out.print(" is married:");
        System.out.println(isMaried);

        String DataType="Data";
        System.out.print("DataType variableName =");
        System.out.println(DataType);






    }
}

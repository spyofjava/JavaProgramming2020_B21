package DailyExercise;

import day32_LocalDate_wrapperClass.DateTimePractice;
import day37_CustomClass.Employee;
import day47_Abstraction.ShapeTasks.Rectangle;

import java.util.ArrayList;
import java.util.Scanner;

public class test {


    public static int a;
    public static double b;
    public static boolean c;
    public static Employee employee1;
    public static Employee employee2;
    private static Rectangle rectangle;

    static {
        a=1;
        b=2;
        System.out.println("Merhaba");
        c=false;
        employee1=new Employee();
        employee2=new Employee();
        employee1.setInfo("ali", "MIT","SDET" , "123", "M", 45, 55);
        System.out.println("Hello");
        employee2.setInfo("veli", "BOFA", "DEVTeam", "121", "M", 45, 45);

        rectangle=new Rectangle(4, 5);
        System.out.println(rectangle.area());


    }

    public static void main(String[] args) {
        System.out.println(employee1);
    }

}


class A{
    public static void main(String[] args) {

        System.out.println("a = " + test.a);
        System.out.println("b = " + test.b);
        System.out.println(test.employee1.name);
        System.out.println("c = " + test.c);
        System.out.println(test.employee2.name);




    }


}

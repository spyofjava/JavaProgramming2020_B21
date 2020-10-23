package day16_Scanner;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {



    Scanner input=new Scanner(System.in);
    System.out.print("Enter Your Salary: $");
    double salary= input.nextDouble();

        System.out.println("Enter your hours per week");
        int hours= input.nextInt();

        double hourlyRate=salary/(hours*52);
        System.out.println("your hourly rate is: $"+hourlyRate);


    }

}

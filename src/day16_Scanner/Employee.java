package day16_Scanner;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        /*
        Scanner input=new Scanner(System.in);

        System.out.println("name: ");
        String  name=input.next();
        System.out.println("last name: ");
        String  lastname=input.next();
        System.out.println("Are you employee or not?(y/n): ");
        String employee=input.next();
        if(employee=="y"){
            System.out.print("Your salary: ");
            input.next();
            int salary=input.nextInt();
            System.out.println("your full name: "+name+" "+lastname+"\n"+
                    "employee status: "+employee+"\n"+ "your salary: "+salary);
        }

        else {
            System.out.println("your full name: "+name+" "+lastname+"\n"+
                    "employee status: "+employee+"\n");
        }

         */


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Are you employed? True or false");
        boolean isEmployed = input.nextBoolean();

        double salary = 0;

        if(isEmployed){
            System.out.println("What is your salary");
            salary = input.nextDouble();
        }

        input.close();

        System.out.println("Full name: " + firstName + " " + lastName);
        System.out.println("Employed: " + isEmployed);
        System.out.println("Salary " + salary);




    }
}

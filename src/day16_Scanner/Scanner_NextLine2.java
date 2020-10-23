package day16_Scanner;

import java.util.Scanner;

public class Scanner_NextLine2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Your Age: ");
        int age= input.nextInt();
        System.out.println("Enter Phone number: ");
        long phoneNum=input.nextLong();
        input.nextLine(); //the purpose of this is to accept the key

        System.out.println("Enter your full name");
        String fullName= input.nextLine(); // accept enter than skip this step

        System.out.println("Name: "+fullName);
        System.out.println("Age: "+age);
        System.out.println("Phone number: "+phoneNum);




    }
}

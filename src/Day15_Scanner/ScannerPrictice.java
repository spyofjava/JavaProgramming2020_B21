package Day15_Scanner;

import java.util.Scanner;

public class ScannerPrictice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("age: ");
        byte age=input.nextByte();
        System.out.print("your favorite number:");
        long favNumber= input.nextLong();
        System.out.print("I'm a student (true/false):");
        boolean status=input.nextBoolean();


        System.out.println("Your age: "+age);
        System.out.println("your favorite number: "+favNumber);
        System.out.println("you are a student: "+status);

        if (status){
            System.out.println("Great, you are a student!");
        }
        else {
            System.out.println("oh okay, you are not a student.");
        }


    }
}

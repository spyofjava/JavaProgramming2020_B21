package day29_Methods;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MethodWithParameter {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Your Age: ");
        int age=scanner.nextInt();
        eligibleToBuyAlcohol(age);


        System.out.println("==================\n");
        System.out.println("Current Year: ");
        int currentYear= scanner.nextInt();
        System.out.println("Birth Year: ");
        int birthYear= scanner.nextInt();
        calculateAge(birthYear,currentYear);



    }

    public static void eligibleToBuyAlcohol(int age){
        if (age>=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not Eligible to buy alcohol");
        }

    }

    public static void calculateAge(int birthYear, int currentYear){
        if (birthYear<currentYear) {
            System.out.println("Your Age is: " + (currentYear - birthYear) + " years old");
        }else {
            System.out.println("Invalid Entry");
        }
    }




}

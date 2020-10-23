package day16_Scanner;

import java.util.Scanner;
/*
ask:
    Count up some points based on the users input:
    Ask the user how many people they live with?
        if user lives with Less than 2 people: add one point
        if the user lives with 3 - 6 people: add two points
        if the user lives with more than 6 people: add three points
    Ask the user what city they live in?
    Ask the user if the live in downtown ("yes or no")
        if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
            if they have thought about it, add one point
            if no, minus one point
    Ask the user their favorite animal?
    Ask the user how many pets they want?
    Ask SSN?
    Print everything and points

 */
public class CountPoint {
    public static void main(String[] args) {



        Scanner input=new Scanner(System.in);
        System.out.println("How many people do you live with ?: ");
        byte people= input.nextByte();


        if(people>0 & people<=12) { //only be 1-2

            if (people <= 2) {
                System.out.println("live with Less than 2 people");
            }
            else if (people<7){//include 3-6
                System.out.println("live with Less than 3-6 people");
            }
            else {//include 7-12
                System.out.println("live with more than 6 people");
            }

        }
        else {
            System.err.println("Not a valid number of people");
        }



    }
}

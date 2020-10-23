package day16_Scanner;

import java.util.Scanner;

public class AllOfYourPersonalInformation {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("How many people they live with you?: ");
        int people= input.nextInt();

        int point=0;
        if(people>0 & people<=12) { //only be 1-2
            if (people <= 2) {
                point++;//point=1
            }
            else if (people<7){//include 3-6
                point+=2;//point=2
            }
            else {//include 7-12
                point+=3;//point=3
            }

        }
        else {
            System.out.println("Not a valid number of people");
        }
        System.out.println(point);



    }
}

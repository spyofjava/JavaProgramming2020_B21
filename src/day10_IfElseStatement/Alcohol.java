package day10_IfElseStatement;

public class Alcohol {
    public static void main(String[] args) {
        int age=14;

        if(age>=21){
            System.out.println("Eligible to buy alcohol");
        }
        else{
            System.out.println("Eligible to buy milk");
        }

        System.out.println("======================");



        int year=2022;

        if(year%4==0){
            System.out.println(year+" is leap year");
        }
        else {
            System.out.println(year+" is not leap year");
        }
        System.out.println("======================");


        int break_time=15;

        if(break_time<15){
            System.out.println("keep going the braak time");
        }

        else {
            System.out.println("back to class");
        }

        System.out.println("======================");



        boolean isalive=true;
        if(isalive){
            System.out.println("keep coding");
        }


    }
}

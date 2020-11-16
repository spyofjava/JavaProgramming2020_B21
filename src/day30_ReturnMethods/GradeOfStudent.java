package day30_ReturnMethods;

import java.util.Arrays;

public class GradeOfStudent {
    public static void main(String[] args) {


        int grade=65;
        Grade(65);


    }

    public static void Grade(int grade){

        if (grade>=0 && grade<=100){

            if (grade>=90){
                System.out.println("A");
            }else if (grade>=80){
                System.out.println("B");
            }else if (grade>=70){
                System.out.println("C");
            }else if (grade>=60){
                System.out.println("D");
            }else {
                System.out.println("F");
            }

        }else {
            System.out.println("Invalid Score");
        }

       // char result=(grade >= 90) ? 'A' : (grade >= 80) ? 'B' : (grade >= 70) ? 'C' : (grade >= 60) ? 'D' : 'F';
       // System.out.println(result);
    }



}

/*
1. create a function that can check if the given integer is positive, negative or zero
2. create a function that can calculate the grade of the student
3. create a function that can print out the combination of two integer arrays
4. create a function that can print a string without the duplicated characters
5.  write a method that can print out the full name of a person in reugral format
            ex:
               fullName("cYbErTeK", "SCHOOL");
               	output:
               		"Cybertek School"
 */
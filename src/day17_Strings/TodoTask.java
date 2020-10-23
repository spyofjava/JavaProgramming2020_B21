package day17_Strings;

import java.util.Scanner;

public class TodoTask {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a centence:");
        String sentence= input.nextLine();

        int i;
       // for(i=0;i<90)
        {
         //   char first=sentence.charAt(i);
        }





    }
}
/*
Tasks:
    1. write a program that ask user to enter sentence.
        then print out the first and last characters
    2. write a program to ask user to enter first name and last name
            then print the full name in all upper case
    3. write a program to ask use to enter first name and last name
            then print the initials (first letter of first name + first letter of last name)
    4. write a program that asks user to enter two string
            then print the longest string
    5. ask the user to enter two words. then add them together and print
            ex:
                input:
                    one
                    eight
                output:
                    oneeight
                    DO NOT use + operator
    6. write a program to ask the user their age. Add 5 to their age and print: In 5 years you will be $newAge years old
    7. write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'. In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them: If the word is less than 3 letters: "Word is too short"
     - If the word is too long: "Word is too long"
    8. write a program that asked the user to enter the number of babies they are having and print a message:
        0: "Sorry"
        1: "Congratulations"
        2: "Wow Twins"
        3: "Wow. Triplets!"
        4, 5, 6: "Unbelievable, $umberOfBabies babies!"
        Any other: "I don't believe you"
    9. Ask the user enter an account number. Check if these account number is valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “Invalid account number
 */
package day18_StringContinue;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {

        String str = "Cybertek";

        str = str.concat(" School"); // "Cybertek School"

        System.out.println(str);

        String str2 = "Cybertek";

        str2 =  str2 + " School";

        System.out.println(str2);

        System.out.println("===============================================");

        String name = "bank of america";

        name = name.toUpperCase(); // "BANK OF AMERICA"

        System.out.println("name = " + name);

        name = name.toLowerCase(); // "bank of america"

        System.out.println("name = " + name);

        System.out.println("====================================");

        String t1 = "          Hello                ";
        t1 = t1.trim(); // "Hello"

        System.out.println(t1);

        String t2 = "Hello       Everyone";
        t2 = t2.trim();

        System.out.println(t2);

        System.out.println("=========================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName =    scan.nextLine();
        firstName = firstName.trim();

        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine();
        lastName = lastName.trim();

        System.out.println("First name is: "+firstName);

        System.out.println("Last name is: "+lastName);
        System.out.println("===============================================");


        String ta="A";
        ta=ta.concat("B");
        String tb="C";
        ta=ta+tb;
        ta.replace('C','D');
        ta=ta+tb;
        System.out.println(ta);






    }
}

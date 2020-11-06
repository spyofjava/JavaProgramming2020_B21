package day22_JavaRecap;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {


         /*
        substring: creates substring from string
            substring(beg, end): creates substring from beginning index till the given ending index (excluded)
            substring(beg): creates the substring from beginning index till end of string
         */

        String sentence = "My name is Cybertek";
                         //01234567890123456789

        String name1 = sentence.substring(11, sentence.length()   );
        System.out.println(name1);

        String name2 = sentence.substring(11);
        System.out.println(name2);

        String str1 = "Thursday is cool, it's a fun day";
        //             012345678

        String day1 = str1.substring(0, 6);
        System.out.println(day1); // Thursd

        String day2 = str1.substring(0,  str1.indexOf(" ") );
        System.out.println(day2);


        String s1 = "https://www.amazon.com";  // .com , .edu ,  .gov,

        String domain = s1.substring( s1.lastIndexOf(".")+1 );
        System.out.println(domain);

        String name = s1.substring( s1.indexOf(".")+1,  s1.lastIndexOf(".")  );

        System.out.println(name);












        Scanner input=new Scanner(System.in);
        String firsname=input.nextLine().toLowerCase().replace(" ","");
        String lastname=input.nextLine().toLowerCase().replace(" ","");

        firsname=firsname.substring(0,1).toUpperCase()+firsname.substring(1);//Cybertek
        lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1);// School

        String fullname=firsname+" "+lastname;

        System.out.println("Full Name= "+fullname);







    }
}

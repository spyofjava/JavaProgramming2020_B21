package day20_ForLoop;

import java.util.Scanner;

public class StringPrictice1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word=input.nextLine();//"Java"

        int lastIndex=word.length()-1;
        char f=word.charAt(0);
        char l=word.charAt(lastIndex);



        System.out.print(f);
        System.out.print(l);


        String r1="Batch "+2+1;
        //Batch 2 +1
        //Batch 21

        System.out.println("================================");

        while (true) {
            System.out.println("Enter building number: ");
            String buildingNumber = input.next();

            input.nextLine();

            System.out.println("Enter street name: ");
            String streetName = input.nextLine();

            System.out.println("Enter apartment number: ");
            String apartment = input.next();

            input.nextLine();

            System.out.println("Enter your city name: ");
            String city = input.nextLine();

            System.out.println("Enter your state name: ");
            String state = input.nextLine();

            System.out.println("Enter your Zip code: ");
            String zip = input.nextLine();

            String address = buildingNumber + " " + streetName + ", Apt# " + apartment + "\n" + city + ", " + state + " " + zip;
            System.out.println(address);

            System.out.println("Would you like continue? Yes, No");

            String  answer=input.next();//.toLowerCase();

            if (answer.equalsIgnoreCase("no")){
                break;
            }


        }

    }


}

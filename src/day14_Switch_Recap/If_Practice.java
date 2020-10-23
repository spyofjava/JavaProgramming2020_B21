package day14_Switch_Recap;

public class If_Practice {
    public static void main(String[] args) {

        //if else :2 options

        int n=10000;
         if (n%2==0) {//for odd
             System.out.println(n+" is odd number");
         }
         else {//for even
             System.out.println(n + " is even number");
         }

         int age=14;
         if (age>=18){
             System.out.println("you're eligible to get license");
         }
         else {
             System.out.println("you're not eligible to get license");
         }


         char grade='A';
         if (grade=='A' || grade=='B' || grade=='C'){
             System.out.println("you passed the class");
         }
         else {
             System.out.println("you did not passed the class");
         }
         //else if: 3 or more options


         int n1=100;
         int n2=200;

        if (n1>n2){
            System.out.println(n1+" is greater than "+n2);
        }
        else if(n1<n2){
            System.out.println(n2+" is greater than "+n1);
        }
        else {//n1=n2
            System.out.println(n1+" is equal to "+n2);
        }

        int num=4;
         if (num==1) System.out.println("Today is monday");
         else if (num==2) System.out.println("Today is Tuesday");
         else if (num==3) System.out.println("Today is Wednesday");
         else if (num==4) System.out.println("Today is Thursday");
         else if (num==5) System.out.println("Today is Friday");
         else if (num==6) System.out.println("Today is Saturday");
         else   System.out.println("Today is Sunday");

        System.out.println("===============================");

         int  hourlyrate=40;//$ must be positive
         int weeklyhours=45;//must be positive
         int numberofweeks=48;//must not more than 52
         int x=0;
        System.out.println("Hourly Rate: "+hourlyrate);
        System.out.println("Weekly Hours: "+weeklyhours);
        System.out.println("Number Of Weeks: "+numberofweeks);


        if (hourlyrate>0){
                if (weeklyhours>0){
                    if (numberofweeks>0 && numberofweeks<=52){
                        x=numberofweeks*weeklyhours*hourlyrate;
                        System.out.println("Your Salary: $"+x);
                    }
                }

                else{
                    System.out.println("Invalid hours");
                }
        }
        else {
            System.out.println("Invalid rate");
        }












    }
}

package day07_UnaryOperators;

public class LeapYear {
    public static void main(String[] args) {
        int year=2020;
        boolean isLeapYear= year%4==0;//checks if 2020 is evenly divisible by 4
        //0<1===>true
        System.out.println(year+" is leap year?: "+isLeapYear);



    }
}

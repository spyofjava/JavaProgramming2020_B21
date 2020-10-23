package day07_UnaryOperators;

public class EvenlyDivisibility {
    public static void main(String[] args) {

        int number=65;

        int reminderof2=number%2;
        boolean divisibleBy2=number%2<1;

        int reminderof3=number%3;
        boolean divisibleBy3=number%3<2;


        int reminderof5=number%5;
        boolean divisibleBy5=number%5<4;

        System.out.println(number+" is divisible by 2: "+divisibleBy2);
        System.out.println(number+" is divisible by 3: "+divisibleBy3);
        System.out.println(number+" is divisible by 5: "+divisibleBy5);







    }
}

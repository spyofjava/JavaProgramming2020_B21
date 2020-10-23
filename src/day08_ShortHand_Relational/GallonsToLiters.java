package day08_ShortHand_Relational;

public class GallonsToLiters {
    public static void main(String[] args) {
        int gallons=100;
        /*double liters= gallons*3.785;
        int result= (int) liters;
        System.out.println(gallons+" gallons equal to "+liters+" liters");
        */

        System.out.println(gallons+" gallons equal to "+((int)(gallons*3.785))+" liters");



    }
}

/*
warmup tasks:
    1. write a program that converts the given number of gallons to liters.
                Note: MUST return integer result
                Ex:
                    gallons: 100
                    output:
                        100 gallons equal to 378 liters
                Hint: 1 gallon = 3.785 liters
    2. write a program that can convert the given number of kg to pounds
            Note: MUST return integer result
            Ex:
                kg = 100;
                output:
                    10 kg equal to 220 pounds
            Hint: 1kg = 2.20462 pounds

    3. manually calculate the following code fragements:
                1. int a = 100;
                   int b = -a++ + ++a - a-- * a-- % 2

 */

package day30_ReturnMethods;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        PositiveNegative(scanner.nextInt());
        PositiveNegative(123);
        PositiveNegative(0);
        PositiveNegative(-10);

        int[] numbers={1,2,3,4,-5,-6,-7,-8,10,11,0};

        for (int each:numbers){
            PositiveNegative(each);
        }

    }

    public static void PositiveNegative(int number) {

        String result = (number > 0) ? number+" is Positive" : (number < 0) ? number+" is Negative" : number+" is Zero";
        System.out.println(result);


        /*
        if (number>0){
            System.out.println();
        }else  if (number<0){
            System.out.println();
        }else {
            System.out.println();
        }
*/

    }


}

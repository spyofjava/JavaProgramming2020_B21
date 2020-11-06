package day23_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {



        /*
        for (int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
*/


        for (int j=1;j<=5;j++){//horizontal
            for (int i=1;i<=30;i++){//vertical
                System.out.print(i+" ");            }
            System.out.println();
        }

        System.out.println("================================================");

        /*


        * --->1.satir 1 star
        ** ---2.satir 2 stars
        ***
        ****
        *****
        ******

         */

        for (int j=1;j<=8;j++) {// satir satir 1,2,3,4,5,6,7,8

            for (int i = 1; i <= j; i++) { //1.satirda kac yildiz var burada
                System.out.print("*");
            }
            System.out.println();

        }


        System.out.println("====================");


        for (int j=8;j>=0;j--) {// satir satir 1,2,3,4,5,6,7,8
            for (int i = 1; i <= j; i++) { //1.satirda kac yildiz var burada
                System.out.print("*");
            }
            System.out.println();

        }



    }
}

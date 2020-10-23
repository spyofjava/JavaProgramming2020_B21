package day19_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

//        for (int i=0;i<=1000;i++){
//            System.out.println(i);
//        }
//############     NUMBERS IN BETWEEN 1000=2000     #####################################
//        for (int i=1000;i<=2000;i++){
//            System.out.print(i+" ");
//
//        }
//#####################  EVEN NUMBER  ####################################

//        for (int i=0;i<=1000;i++){
//            if (i%2==0) {
//                System.out.print(i + " ");
//            }
//        }
//#####################  ODD NUMBER   ####################################
       for (int i=0;i<=100;i++){
           if (i%2==1){
               System.out.print(i+" ");
           }
       }
//#####################  push up   ####################################


        for (int i=0;i<=500;i++){
            System.out.println("Push Up "+i);
        }
        System.out.println();
//#####################  tasks 6   ####################################

        for (char i='a';i<='z';i++){
            System.out.print(i+" ");

        }
//###################################################################






    }
}

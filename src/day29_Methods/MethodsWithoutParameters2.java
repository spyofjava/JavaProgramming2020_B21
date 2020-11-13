package day29_Methods;
public class MethodsWithoutParameters2 {
    public static void main(String[] args) {



        System.out.print("Odd Number: ");
        MethodsWithoutParameters2.printOddNumber1To100();
        System.out.println("Even Number: ");
        MethodsWithoutParameters2.printEvenNumber1To100();

    }

    private static void printOddNumber1To100() {

        for (int i=1;i<=100;i++){
            if (i%2!=0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }




    private  static void printEvenNumber1To100(){

        for (int i=1;i<=100;i++){
            if (i%2==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }



}

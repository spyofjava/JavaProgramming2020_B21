package day29_Methods;

public class MethodsWithoutParameters {
    public static void main(String[] args) {


        printHello5Times();
        System.out.println("Ibrahim");
        printHello5Times();
        System.out.println("Cybertek");
        printHello5Times();

        MethodsWithoutParameters.printHello5Times();


    }
//      AccessModifier specifier  returnTYPE   MethodName (Parameter){ }
        public static void printHello5Times() {


            for (int i=0;i<6;i++){
                System.out.println("Hello");

            }

        }




}

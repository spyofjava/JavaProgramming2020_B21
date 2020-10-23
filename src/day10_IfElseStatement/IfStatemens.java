package day10_IfElseStatement;

public class IfStatemens {
    public static void main(String[] args) {

        int score=45;

        if(score>=60){
            System.out.println("Congrats!");
        }

        else {
            System.out.println("keep trying");
        }


        System.out.println("=====================");

        int angle1=90;
        int angle2=90;
        int angle3=90;
        int angle4=98;

        boolean isvalidrectangle= angle1 ==90 && angle2==90 &&angle3==90 &&angle4==90 ;

        if(isvalidrectangle){
            System.out.println("It is valid rectangle");
        }



        else {
            System.out.println("It is not valid rectangle");
        }




        int a=1000;
        int b=200;

        if(a>b){
            System.out.println(a+" is greater");
        }
        else{
            System.out.println(b+" is greater");
        }

    }
}

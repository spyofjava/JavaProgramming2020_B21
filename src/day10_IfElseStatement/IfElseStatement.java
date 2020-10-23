package day10_IfElseStatement;

public class IfElseStatement {
    public static void main(String[] args) {
        int number=101;
        boolean isEven=number%2==0;

        if(isEven){
            System.out.println(number+" is even");
        }
/*
        if(!isEven){
            System.out.println(number+" is odd");
        }

 */
        else{
            System.out.println(number+" is odd");
        }

        int score=45;
        if(score>=60){
            System.out.println("Passed the exam");
        }
        else{
            System.out.println("Failed the exam");
        }






    }
}

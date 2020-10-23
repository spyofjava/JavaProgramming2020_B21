package day11_MultiBranchIf;

public class ExpandingGradeSystem {
    public static void main(String[] args) {
        int average=53;
        String result="";


        boolean average1=average<=100 && average>=90;
        boolean average2=average<=89 && average>=80;
        boolean average3=average<=79 && average>=70;
        boolean average4=average<=69 && average>=60;


        if (average1){
            result="A";
        }
        else if(average2){
            result="B";
        }
        else if(average3){
            result="C";
        }
        else if(average4){
            result="D";
        }
        else {
            result="F";
        }
        System.out.println(result);
        System.out.println("====================================");

        int score=50;
        char grade2 =' ';

        if (score>=90){
            grade2='A';
        }
        else if (score>=80){
            grade2='B';
        }
        else if (score>=70){
            grade2='C';
        }
        else if (score>=60){
            grade2='D';
        }

        else {
            grade2='F';
        }
        System.out.println("your grade is: "+grade2);


    }
}

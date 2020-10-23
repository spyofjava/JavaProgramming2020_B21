package day11_MultiBranchIf;

public class GradeReport {
    public static void main(String[] args) {
        int score=29;//

        boolean fail=score<60;
        boolean pass=score>=60&&score<90;

        String result="";

        if(fail){
            result="Fail";
        }
        else if(pass){
            result="Pass";
        }
        else {
            result="Passed with distinction";
        }
        System.out.println(result);



    }
}

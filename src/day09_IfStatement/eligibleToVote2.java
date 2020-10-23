package day09_IfStatement;

public class eligibleToVote2 {

    public static void main(String[] args) {



        String name="Daniel";
        boolean isUSACitizen= true;
        int age=19;
        boolean hasCriminalBackground=true;


        boolean isEligible= isUSACitizen==true && age >=18 && hasCriminalBackground;
        //                  true==true && 25>=18 && false==false
        //                  true && true && true
        //                  true
        System.out.println(name+" is eligible to vote: "+isEligible);


















    }
}

package day29_Methods;

public class EligibleToVote {

    public static void main(String[] args) {

        eligibilityToVote("Ibrahim","Usa",37,true);
        eligibilityToVote("xhon","uSa",44,true);

    }

    public static void eligibilityToVote(String name,String Citizenship,int age,boolean isAlive){

        if (isAlive) {
            if (Citizenship.equalsIgnoreCase("USA")) {
                if (age >= 18) {
                    System.out.println(name + ", you are eligible to vote");
                } else {
                    System.out.println(name +", You must be at least 18 years old");
                }
            }else {
                System.out.print(name +", You must be Citizen of USA");
                if (age < 18) {
                    System.out.println(" and at least 18 years old");
                }
            }
        }else {
            System.out.print(name +", You must come back to life in order to vote");
            if (!Citizenship.equalsIgnoreCase("USA")){
                System.out.print(", You must be Citizen of USA");
            }
            if (age<18){
                System.out.println(" and at least 18 years old");
            }
        }

    }


}

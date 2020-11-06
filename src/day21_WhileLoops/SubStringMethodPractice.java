package day21_WhileLoops;

public class SubStringMethodPractice {
    public static void main(String[] args) {

        String email="John_Daniel@BOfA.com";

        String lastname=email.substring(0,email.indexOf("_"));
        System.out.println("Last name= "+lastname);
        String firstname=email.substring(email.indexOf("_")+1,email.lastIndexOf("@"));
        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("First name= "+firstname);
        System.out.println("domain="+domain);


    }
}

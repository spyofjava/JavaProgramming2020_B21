package day11_MultiBranchIf;

public class DaysInMonth2 {
    public static void main(String[] args) {
        int month=4;//1 to12
        boolean has28days=month==2;
        boolean has30days=month==4||month==6||month==9||month==11;


        if(has28days){
            System.out.println("28 days");
        }
        else if (has30days){
            System.out.println("30 days");
        }
        else{
            System.out.println("31 days");
        }





    }
}

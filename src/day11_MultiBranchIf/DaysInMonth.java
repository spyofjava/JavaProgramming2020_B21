package day11_MultiBranchIf;

public class DaysInMonth {
    public static void main(String[] args) {
        int month=10;//1 to12
        boolean has28days=month==2;
        boolean has30days=month==4||month==6||month==9||month==11;
        boolean has31days=!has28days&&!has30days;

        if(has28days){
            System.out.println("28 days");
        }
        if (has30days){
            System.out.println("30 days");
        }
        if(has31days){
            System.out.println("31 days");
        }







    }
}

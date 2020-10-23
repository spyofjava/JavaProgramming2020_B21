package day13_SwitchStatement;

public class DaysOfWeek_SwitchCase {
    public static void main(String[] args) {
        int n=4;
        switch (n){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("There is no such a day");

//it doesn't need to give break statement.
                // Switch statement will stop at curly braces of end of
                // the switch


        }
    }
}

package day13_SwitchStatement;

public class DaysOfWeek2_SwitchCase {
    public static void main(String[] args) {
        int n=7;
        String day="";
        switch (n){
            case 1:
                day="Monday";
                break;

            case 2:
                day="Tuesday";
                break;

            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;

            case 5:
                day="Friday";
                break;

            case 6:
                day="Saturday";
                break;
            case 7:
                day="Sunday";
                break;

            default:
                day="There is no such a day";

                //it doesn't need to give break statement.
                // Switch statement will stop at curly braces of end of
                // the switch

        }
        System.out.println(day);


    }
}

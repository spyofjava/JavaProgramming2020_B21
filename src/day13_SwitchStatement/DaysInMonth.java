package day13_SwitchStatement;

public class DaysInMonth {
    public static void main(String[] args) {

        int year=2020;
        int month=2;//1~12

        boolean has28r29Days=month==2;
        boolean has30Days=month==4 || month==6 || month==9 || month==11;
        //boolean has31Days=!has28r29Days || !has30Days;
        String result="";

        if (month>0 && month<13){//1~122

            if(has28r29Days){// if the month is february
                if(year%4==0){//leap year
                    result="29 days";
                }
                else {//not leap year
                    result="28 days";
                }
            }
            else if (has30Days){// for April,June,September,November
                result="30 days";
            }
            else {
                result="31 days";
            }

        }
        else{// if the month is valid
            result="Invalid Month";

        }



    }
}

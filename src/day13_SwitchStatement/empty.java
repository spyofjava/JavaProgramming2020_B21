package day13_SwitchStatement;

public class empty {
    public static void main(String[] args) {

        int year=2020;
        int month=2;



        if (month>=1 &&month<=12){

                if (month==2) {

                        if (year % 4 == 0) {

                            System.out.println("29 days");
                        }
                        else if (year % 4 != 0) {
                             System.out.println("28 days");
                        }
                }
                else if (month==4||month==6||month==9||month==11){
                    System.out.println("30 days");
                }
                else{
                     System.out.println("31 days");
                 }

            }


        else{
            System.out.println("there is no such a month");
        }

        System.out.println("====================================");



        String brand="mclaren";
        String choose="";
        switch (brand){
            case "toyota":choose="TOYOTA WAS SELECTED";
                break;
            case "nissan":choose="NISSAN WAS SELECTED";
                break;
            case "mclaren":choose="MCLAREN WAS SELECTED";
                break;
            case "tesla":choose="TESLA WAS SELECTED";
                break;
            case "mercedes":choose="MERCEDES WAS SELECTED";
                break;

            default:
                System.out.println("Invalid Car");
        }
        System.out.println(choose);


        System.out.println("====================================");











    }

}


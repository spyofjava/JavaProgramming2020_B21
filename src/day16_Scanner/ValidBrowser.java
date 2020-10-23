package day16_Scanner;

import java.util.Scanner;

public class ValidBrowser {
    public static void main(String[] args) {
/*
        Scanner input=new Scanner(System.in);
        System.out.println("Select a browser");
        String browser=input.next();
        input.close();
        boolean b1=browser=="chrome";
        boolean b2=browser=="safari";
        boolean b3=browser=="firefox";
        boolean b4=browser=="opera";
        boolean b5=browser=="internet explorer";
        String b=b1?browser+" is opening":b2?browser+" is opening":b3?browser+" is opening":
                b4?browser+" is opening":b5?browser+" is opening":"Invalid browser";
        System.out.println(b);

 */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the browser type");
        String browser = input.nextLine();

        input.close();

        switch (browser) {
            case "CHROME":
            case "chrome":
                System.out.println("Chrome is opening");
                break;
            case "FIREFOX":
            case "firefox":
                System.out.println("Firefox is opening");
                break;
            case "opera":
                System.out.println("Opera is opening");
                break;
            case "safari":
                System.out.println("Safari is opening");
                break;
            case "internet explorer":
                System.out.println("Internet Explorer is opening");
                break;
            default:
                System.out.println(browser + " is not valid");


        }
    }
}





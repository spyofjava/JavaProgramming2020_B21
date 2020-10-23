package day13_SwitchStatement;

public class SelectBrowser_SwitchCase {
    public static void main(String[] args) {

        String browser="opera";
        String SelectedBrowser="";

        switch (browser){
            case "chrome":
                SelectedBrowser="CHROME BROWSER";
                break;
            case "firefox":
                SelectedBrowser="FIREFOX BROWSER";
                break;
            case "safari":
                SelectedBrowser="SAFARI BROWSER";
                break;
            case "opera":
                SelectedBrowser="OPERA BROWSER";
                break;
            case "edge":
                SelectedBrowser="EDGE BROWSER";
                break;
            case "internet explorer":
                SelectedBrowser="INTERNET EXPLORER BROWSER";
                break;
            default:
                System.out.println("Invalid Browser");

        }
        System.out.println(SelectedBrowser);


    }
}

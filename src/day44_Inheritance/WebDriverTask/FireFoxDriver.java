package day44_Inheritance.WebDriverTask;

public class FireFoxDriver extends WebDriver {

    public FireFoxDriver() {
        super("FireFox Browser","v83.0.0");
    }

    @Override
    public void get(String URL) {
        System.out.println("Oppening "+URL+" from FireFox driver");
    }

    @Override
    public void close() {
        System.out.println("Closing FireFox driver");
    }

    @Override
    public void maximize() {
        //super.maximize();
        System.out.println("Maximizing FireFox driver");
    }

}
